package basic;

import javafx.application.Application;
import javafx.stage.Stage;;

public class Ex01AppMain extends Application {

	public Ex01AppMain() {
		System.out.println(Thread.currentThread().getName() + " : Ex01AppMain() 실행.");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : init() 실행.");
		super.init();
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		System.out.println(Thread.currentThread().getName() + " : start() 실행.");
		
		primaryStage.setTitle("JavaFX application");
		primaryStage.show();	// window 띄우기
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName() + " : stop() 실행.");
		super.stop();
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : main() 실행.");
		launch(args);
	}

}
