package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable{

	@FXML TextArea textArea1;
	@FXML TextArea textArea2;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("RootController �ʱ�ȭ");
		
	}
}
