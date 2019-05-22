package control;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import control.model.Camera;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ex03ViewRootController implements Initializable{

	@FXML ListView<String> listView;
	@FXML TableView<Camera> tableView;
	
	@FXML TableColumn<Camera, String> tcMaker;
	@FXML TableColumn<Camera, String> tcImage;
	@FXML TableColumn<Camera, Integer> tcPrice;
	
	@FXML ImageView imageView;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		ArrayList<String> items = new ArrayList<String>();
		items.add("Nikon");
		items.add("Canon");
		items.add("Sony");
		
		
		listView.getItems().addAll(items); 	// ArrayList 다 가져오기
		
		// 테이블뷰에 데이터 세팅
		tableView.setItems(FXCollections.observableArrayList(
				new Camera("Nikon", "Nikon.png", 1200000),
				new Camera("Canon", "Canon.png", 1300000),
				new Camera("Sony", "Sony.png", 1100000)
		));
		
		// 셀에 배치할 값 세팅
		tcMaker.setCellValueFactory(new PropertyValueFactory("maker"));
		tcImage.setCellValueFactory(new PropertyValueFactory("image"));
		tcPrice.setCellValueFactory(new PropertyValueFactory("price"));
		
		
		// 속성 감시
		listView.getSelectionModel().selectedIndexProperty()
			.addListener(new ChangeListener<Number>() {
			
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				
				System.out.println("선택된 index : " + newValue);
				
				tableView.getSelectionModel().select(newValue.intValue());
				tableView.scrollTo(newValue.intValue());
				
			}
		});
		
		tableView.getSelectionModel().selectedItemProperty()
			.addListener(new ChangeListener<Camera>() {
				
				@Override
				public void changed(ObservableValue<? extends Camera> observable, Camera oldValue, Camera newValue) {
					
					if(newValue != null) {
						System.out.println("선택된 item : " + newValue.getImage());
						imageView.setImage(new Image("/res/images/" + newValue.getImage()));
					} else {
						System.out.println("등록된 이미지가 없습니다. ");
					}
				}
			});
		
	}
	
	public void handleOK(ActionEvent event) {
		
		String listitem = listView.getSelectionModel().getSelectedItem();
		System.out.println(">> 선택된 리스트 아이템 : " + listitem);
		
		Camera camera = tableView.getSelectionModel().getSelectedItem();
		if(camera != null) {
			System.out.println(">>>> 제조사 : " + camera.getMaker());
			System.out.println(">>>> 이미지 : " + camera.getImage());
			System.out.println(">>>> 가격 : " + camera.getPrice());
			
		}
	}
	
	public void handleExit(ActionEvent event) {
		Platform.exit();
	}
}








