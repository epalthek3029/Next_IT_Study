import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02System {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		while(true) {
			System.out.print("command : ");
			String command = reader.readLine();
			if("exit".equals(command)) {
				System.out.println("프로그램 종료.......");
				System.exit(0); // 프로그램 종료 
			}
			System.out.println("명령어 : " + command);
		}
		*/
		
		// long startTime = System.currentTimeMillis(); // 1970.01.01 0시 0분 0
		long startTime = System.nanoTime();
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += i;
			// 메소드 호출
		}
		//long duration = System.currentTimeMillis() - startTime;
		long duration = System.nanoTime() - startTime;
		System.out.println("경과시간 : " + duration);
		
		// 프로퍼티(Property) 정보
		// key = value : os.name = Linux
		// 		  		  java.version = 1.8.0 191
		System.out.println("os.name = " + System.getProperty("os.name"));
		System.out.println("java.version = " + System.getProperty("java.version"));
		
		System.getProperties().list(System.out);
		
		
		
		
	}
}
