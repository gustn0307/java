package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController {
	ExecutorService es;
	ServerSocket serverSocket;
	List<Client> clientList = new Vector<>();
	@FXML
	Button btnStart;
	@FXML
	TextArea txtTextArea;

	public void btnStartClicked() {
		if (btnStart.getText().equals("서버시작")) {
			serverStart();
		} else if (btnStart.getText().equals("서버종료")) {
			serverStop();
		}
	}

	private void serverStop() {
		btnStart.setText("서버시작");

		try {
			for (Client client : clientList) {
				if(client!=null)
					client.socket.close();
				clientList.remove(client);
			}

			if (serverSocket != null) 
					serverSocket.close();
			if(es!=null)
				es.shutdown();
			displayText("[서버종료]");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	private void serverStart() {
		btnStart.setText("서버종료");
		es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 9999));
			displayText("[서버가 시작합니다]" + LocalDateTime.now());
		} catch (IOException e) {

			if (serverSocket != null)
				serverStop();
			return;
		}

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Socket socket = serverSocket.accept();

						Platform.runLater(() -> {
							displayText("[연결 확인] " + socket.getRemoteSocketAddress() + " : "
									+ Thread.currentThread().getName());
						});
						Client client = new Client(socket);
						clientList.add(client);
						Platform.runLater(() -> {
							displayText("[연결 개수] : " + clientList.size() + "개의 클라이언트 접속중");
						});
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		es.submit(runnable); // 스레드 풀에서 처리
	}

	class Client { // 내부클래스(inner class)
		Socket socket;

		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		private void receive() { // 메시지 받기 -> 나머지에게 전송
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							byte[] buffer = new byte[100];
							InputStream is = socket.getInputStream();
							int readCount = is.read(buffer);
							// 서버에 요청메세지..

							String data = new String(buffer, 0, readCount, "UTF-8");
							// 나머지 사람들한테 전송
							for (Client client : clientList) {

								client.send(data);
							}
						} catch (IOException e) {
							clientList.remove(Client.this);
							String msg = "[요청 처리]  " + Thread.currentThread().getName() + " : "
									+ socket.getRemoteSocketAddress();
							Platform.runLater(() -> {
								displayText(msg);
							}); // UI컨트롤
							try {
								socket.close();
							} catch (IOException e1) {
							}
						}
					}
				}
			}; // runnable
			es.submit(runnable); // 스레드 풀에서 처리
		} // receive

		protected void send(String data) { // 메세지 보내기
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						OutputStream os = socket.getOutputStream();
						os.write(data.getBytes("UTF-8"));
						os.flush();
					} catch (IOException e) {
						clientList.remove(Client.this);
						String msg = "[CLIENT 통신 안됨]  " + Thread.currentThread().getName() + " : "
								+ socket.getRemoteSocketAddress();
						Platform.runLater(() -> {
							displayText(msg);
						}); // UI컨트롤
						try {
							socket.close();
						} catch (IOException e1) {
						}
					}
				}
			};
			es.submit(runnable); // 스레드 풀에서 처리
		} // send

	} // Client

	protected void displayText(String msg) { // txtTextAread에 메시지 출력하기
		txtTextArea.appendText(msg + "\n");

	}
} // ServerClient
