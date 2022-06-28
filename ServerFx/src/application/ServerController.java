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
		if (btnStart.getText().equals("��������")) {
			serverStart();
		} else if (btnStart.getText().equals("��������")) {
			serverStop();
		}
	}

	private void serverStop() {
		btnStart.setText("��������");

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
			displayText("[��������]");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	private void serverStart() {
		btnStart.setText("��������");
		es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 9999));
			displayText("[������ �����մϴ�]" + LocalDateTime.now());
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
							displayText("[���� Ȯ��] " + socket.getRemoteSocketAddress() + " : "
									+ Thread.currentThread().getName());
						});
						Client client = new Client(socket);
						clientList.add(client);
						Platform.runLater(() -> {
							displayText("[���� ����] : " + clientList.size() + "���� Ŭ���̾�Ʈ ������");
						});
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		};
		es.submit(runnable); // ������ Ǯ���� ó��
	}

	class Client { // ����Ŭ����(inner class)
		Socket socket;

		public Client(Socket socket) {
			this.socket = socket;
			receive();
		}

		private void receive() { // �޽��� �ޱ� -> ���������� ����
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					while (true) {
						try {
							byte[] buffer = new byte[100];
							InputStream is = socket.getInputStream();
							int readCount = is.read(buffer);
							// ������ ��û�޼���..

							String data = new String(buffer, 0, readCount, "UTF-8");
							// ������ ��������� ����
							for (Client client : clientList) {

								client.send(data);
							}
						} catch (IOException e) {
							clientList.remove(Client.this);
							String msg = "[��û ó��]  " + Thread.currentThread().getName() + " : "
									+ socket.getRemoteSocketAddress();
							Platform.runLater(() -> {
								displayText(msg);
							}); // UI��Ʈ��
							try {
								socket.close();
							} catch (IOException e1) {
							}
						}
					}
				}
			}; // runnable
			es.submit(runnable); // ������ Ǯ���� ó��
		} // receive

		protected void send(String data) { // �޼��� ������
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					try {
						OutputStream os = socket.getOutputStream();
						os.write(data.getBytes("UTF-8"));
						os.flush();
					} catch (IOException e) {
						clientList.remove(Client.this);
						String msg = "[CLIENT ��� �ȵ�]  " + Thread.currentThread().getName() + " : "
								+ socket.getRemoteSocketAddress();
						Platform.runLater(() -> {
							displayText(msg);
						}); // UI��Ʈ��
						try {
							socket.close();
						} catch (IOException e1) {
						}
					}
				}
			};
			es.submit(runnable); // ������ Ǯ���� ó��
		} // send

	} // Client

	protected void displayText(String msg) { // txtTextAread�� �޽��� ����ϱ�
		txtTextArea.appendText(msg + "\n");

	}
} // ServerClient
