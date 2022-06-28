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

	public void btnConnClicked() { // ����, ���� ��ư Ŭ���� ����
		if (btnConn.getText().equals("����")) {
			startClient();
		} else if (btnConn.getText().equals("����")) {
			stopClient();
		}
	}

	private void stopClient() {
		displayText("[���� ����]");
		btnSend.setDisable(true);
		try {
			if (socket != null)
				socket.close();
			btnConn.setText("����");
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
					btnConn.setText("����");
					displayText("[ä�ù� ����]");
					btnSend.setDisable(false); // ��ư ���
				});
				
			} catch (IOException e) {
				Platform.runLater(()->{
					displayText("[��� ��� �߻�]");
				}); 
				stopClient();
				return;
			}

			receive(); // �������� ���� ������ �ޱ�
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

	public void btnSendClicked() { // ���� ��ư Ŭ���� ����
		Thread th=new Thread(()->{
			String msg=txtInput.getText();
			try {
				OutputStream os=socket.getOutputStream();
				os.write(msg.getBytes("UTF-8"));
				os.flush();
			} catch (IOException e) {
				Platform.runLater(()->{
					displayText("[���� ��� �ȵ�]");
				});
				stopClient();
			}
		});
		th.start();
	}

	void displayText(String text) { // txtTextAread�� �޽��� ����ϱ�
		txtDisplay.appendText(text + "\n");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnSend.setDisable(true);

	}
}
