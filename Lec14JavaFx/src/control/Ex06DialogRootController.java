package control;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Ex06DialogRootController implements Initializable {


	private Stage primaryStage;
	
	public void setPrimaryStage(Stage primaryStage) {
		this.primaryStage = primaryStage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		
	}

	public void handleOpenFile(ActionEvent event) {

		FileChooser fileChooser = new FileChooser();
		
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("Text File","*.txt"),
				new FileChooser.ExtensionFilter("Java File","*.Java"),
				new ExtensionFilter("Class File","*.Class"),
				new ExtensionFilter("Image File","*.Class","*.jpeg","*.bmp","*.png","*.gif"),
				new ExtensionFilter("All File","*.*")
				);
		
		File selectedFile = fileChooser.showOpenDialog(primaryStage);
		
		if(selectedFile != null) {
			System.out.println("선택한 파일 : " + selectedFile.getPath());
		}
	}

	public void handleSaveFile(ActionEvent event) {

		FileChooser fileChooser = new FileChooser();
		
		File selectedFile = fileChooser.showSaveDialog(primaryStage);
		
		if(selectedFile != null) {
			System.out.println("저장할 파일" + selectedFile.getPath());
		}
	}

	public void handleOpenDirectory(ActionEvent event) {
		
		DirectoryChooser directoryChooser = new DirectoryChooser();
		
		File directory = directoryChooser.showDialog(primaryStage);
		
		if(directory != null) {
			System.out.println("선택한 디렉토리 : " + directory.getPath());
		}
	}

	public void handlePopup(ActionEvent event) throws IOException {

		Popup popup = new Popup();
		
		HBox root = FXMLLoader.load(getClass().getResource("Ex06Popup.fxml"));
		
		
		// 컨트롤을 가져오기
		ImageView imageView = (ImageView)root.lookup("#imageView");
		Label lblMessage = (Label)root.lookup("#lblMessage");
		
		lblMessage.setText("새로운 메시지 1개가 도착했습니다.");
		
		imageView.setImage(new Image("/res/images/info.png"));
		
		// 이벤트 핸들러 등록
		imageView.setOnMouseClicked((e)->popup.hide());
		
		popup.getContent().add(root);
		popup.setAutoHide(true);
		popup.show(primaryStage);
	}

	public void handleCustom(ActionEvent event) throws IOException {
		
		Stage dialog = new Stage(StageStyle.UTILITY);
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("Ex06Login.fxml"));
		
		dialog.initOwner(primaryStage);
		dialog.initModality(Modality.WINDOW_MODAL);
		
		TextField txtID = (TextField)root.lookup("#txtID");
		PasswordField txtPwd = (PasswordField)root.lookup("#txtPwd");
		Button btnLogin = (Button)root.lookup("#btnLogin");
		
		btnLogin.setOnAction((e)->{
			String id = txtID.getText();
			String pwd = txtPwd.getText();
			
			System.out.println("ID : " + id + "PWS : " + pwd);
			dialog.hide();
		});
		
		Scene scene = new Scene(root);
		
		dialog.setScene(scene);
		dialog.setTitle("로그인");
		dialog.show();
		
	}
}










