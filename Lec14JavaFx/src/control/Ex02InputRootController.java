package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Ex02InputRootController implements Initializable{
	
	@FXML TextField txtTitle;
	@FXML PasswordField textPassword;
	@FXML ComboBox<String> cmbOpenYn;
	@FXML DatePicker datFinish;
	@FXML TextArea txtContent;
	
	
	@Override	// 이벤트 핸들러 등록, UI초기화 작업, 속성 감시 및 바인딩 작업. 

	public void initialize(URL location, ResourceBundle resources) {
		
		// UI 초기화
		
		ObservableList<String> items = FXCollections.observableArrayList(
				"공개", 
				"비공개", 
				new String("Yes"), 
				String.valueOf("No")
		);
		
		cmbOpenYn.setItems(items);
		
		
	}
	
	public void handleSave(ActionEvent event) {
		
		String title = txtTitle.getText();
		String password = textPassword.getText();
		String openYn = cmbOpenYn.getValue();
		String finishDate = datFinish.getValue().toString();
		String content = txtContent.getText();
		
		System.out.println("제목 : " + title );
		System.out.println("패스워드 : " + password );
		System.out.println("공개여부 : " + openYn );
		System.out.println("게시종료 : " + finishDate );
		System.out.println("내용 : " + content );
		
	}
	
	public void handleClose(ActionEvent event) {
		Platform.exit();
	}
}





