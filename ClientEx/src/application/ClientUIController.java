package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientUIController implements Initializable {

	@FXML
	Button btnConn;
	@FXML
	TextField txtInput;
	@FXML
	Button btnSend;
	@FXML
	TextArea txtDisplay;
	Socket socket;

	public void btnConnClicked() { // 시작, 종료 버튼 클릭시 실행
		if (btnConn.getText().equals("시작")) {
			startClient();
		} else if (btnConn.getText().equals("종료")) {
			stopClient();
		}
	}

	private void stopClient() {
		displayText("[연결 종료]");
		btnSend.setDisable(true);
		try {
			if (socket != null)
				socket.close();
			btnConn.setText("시작");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void startClient() {
		Thread th=new Thread(()->{
			try {
				socket = new Socket();
				socket.connect(new InetSocketAddress("127.0.0.1", 9999));
				
				Platform.runLater(()->{
					btnConn.setText("종료");
					displayText("[채팅방 연결]");
					btnSend.setDisable(false); // 버튼 사용
				});
				
			} catch (IOException e) {
				Platform.runLater(()->{
					displayText("[통신 장애 발생]");
				}); 
				stopClient();
				return;
			}

			receive(); // 서버에서 보낸 데이터 받기
		});
		th.start();
	}

	private void receive() {
		while (true) {
			Thread th = new Thread(() -> {
				try {
					byte[] buffer = new byte[100];
					InputStream is = socket.getInputStream();
					int readCount = is.read(buffer);

					String msg = new String(buffer, 0, readCount, "UTF-8");
					Platform.runLater(() -> {
						displayText(msg);
					});
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			th.start();
		}
	}

	public void btnSendClicked() { // 전송 버튼 클릭시 실행
		Thread th=new Thread(()->{
			String msg=txtInput.getText();
			try {
				OutputStream os=socket.getOutputStream();
				os.write(msg.getBytes("UTF-8"));
				os.flush();
			} catch (IOException e) {
				Platform.runLater(()->{
					displayText("[서버 통신 안됨]");
				});
				stopClient();
			}
		});
		th.start();
	}

	void displayText(String text) { // txtTextAread에 메시지 출력하기
		txtDisplay.appendText(text + "\n");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnSend.setDisable(true);

	}
}
