import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex11PrintWriter {

	public static void main(String[] args) throws IOException {
		
//		PrintWriter writer = new PrintWriter(System.out, true); // 콘솔 출력(byte) 
		PrintWriter writer = new PrintWriter(new FileWriter("print.txt"), true); // 파일 출력(char)
		
		writer.printf("%s, %d, %c, %s\n", "이산", 25, 'M', "010-1212-5454");
		writer.printf("%s, %d, %c, %s\n", "설현", 25, 'M', "010-1212-5454");
		writer.printf("%s, %d, %c, %s\n", "제니", 25, 'M', "010-1212-5454");
		writer.printf("%s, %d, %c, %s\n", "윤하", 25, 'M', "010-1212-5454");
//		writer.flush();	 // 위에 System.out 옆에 true 는 오토 플러시 기능
		
		
		System.out.println("데이터 출력 완료");
	}
}
