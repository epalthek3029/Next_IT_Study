package animation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class Ex01AnimationRootController implements Initializable{

	@FXML Button btnLogin;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	public void handleShowLogin(ActionEvent event) throws IOException {
		
		Parent login = FXMLLoader.load(getClass().getResource("Ex01LoginRoot.fxml"));
		
		StackPane root = (StackPane)btnLogin.getScene().getRoot();
		
		root.getChildren().add(login);
		
		// 애니메이션 효과
		login.setOpacity(0);	// 0.0 ~ 1.0
		
		KeyValue keyValue = new KeyValue(login.opacityProperty(), 1);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(2000), keyValue);
		
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
		
	}
}
