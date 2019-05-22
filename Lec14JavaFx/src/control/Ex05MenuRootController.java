package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class Ex05MenuRootController implements Initializable{

	
	@FXML TextArea txtArea;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void handleNew(ActionEvent event) {
		txtArea.appendText("New 클릭\n");
	}
	public void handleOpen(ActionEvent event) {
		txtArea.appendText("Open 클릭\n");
	}
	public void handleSave(ActionEvent event) {
		txtArea.appendText("Save 클릭\n");
	}
	public void handleExit(ActionEvent event) {
		Platform.exit();
	}
}
