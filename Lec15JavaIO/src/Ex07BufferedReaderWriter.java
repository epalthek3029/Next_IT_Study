import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07BufferedReaderWriter {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new FileReader("src/Ex07BufferedReaderWriter.java"));
			writer = new BufferedWriter(new FileWriter("/home/pc26/IO/Ex07BufferedReaderWriter.java"));
			
			while(true) {
				String str = reader.readLine();	//\r\n(enter)를 기준으로 읽음.
				if(str == null) {
					System.out.println("== 파일 쓰기 완료 ==");
					break;
				}
				writer.write(str);
				writer.newLine();
			}
			writer.flush(); // 버퍼의 내용을 출력.
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				if(writer != null) reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
