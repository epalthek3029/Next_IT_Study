package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Ex01ButtonRootController implements Initializable{
	
	@FXML CheckBox chkNikon;
	@FXML CheckBox chkCanon;
	@FXML CheckBox chkSony;
	
	@FXML VBox imageBox;
	
	@FXML RadioButton rdoNikon;
	@FXML RadioButton rdoCanon;
	@FXML RadioButton rdoSony;

	ToggleGroup rdoGroup = new ToggleGroup(); 
	
	@FXML ImageView imageView;
	
	@FXML ToggleGroup togGroup;
	
	@FXML Rectangle rectangle;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 이벤트 핸들러 등록, UI 컨트롤 초기화, 속성 감시 및 바인딩.
		
		// UI 컨트롤 초기화
		rdoNikon.setToggleGroup(rdoGroup);
		rdoCanon.setToggleGroup(rdoGroup);
		rdoSony.setToggleGroup(rdoGroup);
		
		// 속성 감시
		rdoGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				
				System.out.println("선택된 라디오 : " + newValue.getUserData());
				
				imageView.setImage(new Image("/res/images/" + newValue.getUserData()));
			}
		});
		
		togGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				
				rectangle.setFill((Color)newValue.getUserData());
			}
		});
		
	}
	
	public void handleCheckAction(ActionEvent event) {
		
		imageBox.getChildren().clear();
		
		if(chkNikon.isSelected()) {
			System.out.println("선택된 데이터 : " + chkNikon.getUserData());
			ImageView imageView = new ImageView("/res/images/" + chkNikon.getUserData());
			imageView.setFitWidth(50);
			imageView.setFitHeight(50);
			imageBox.getChildren().add(imageView);
		}
		
		if(chkCanon.isSelected()) {
			System.out.println("선택된 데이터 : " + chkCanon.getUserData());
			ImageView imageView = new ImageView("/res/images/" + chkCanon.getUserData());
			imageView.setFitWidth(50);
			imageView.setFitHeight(50);
			imageBox.getChildren().add(imageView);
		}
		
		if(chkSony.isSelected()) {
			System.out.println("선택된 데이터 : " + chkSony.getUserData());
			ImageView imageView = new ImageView("/res/images/" + chkSony.getUserData());
			imageView.setFitWidth(50);
			imageView.setFitHeight(50);
			imageBox.getChildren().add(imageView);
		}
	}
	
	
	public void handleExit(ActionEvent event) {
		System.out.println("프로그램을 종료합니다.");
		Platform.exit();
	}
	
}
