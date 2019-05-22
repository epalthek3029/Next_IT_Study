import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05FileReaderWriter {

	public static void main(String[] args) {
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			// Stream Open
			reader = new FileReader("src/Ex05FileReaderWriter.java");
			writer = new FileWriter("/home/pc26/IO/Ex05FileReaderWriter.java");
			
			char[] data = new char[256];
			// Read / Write
			while(true) {
//				int x = reader.read();	// 한 문자씩 읽기
				
				int x = reader.read(data);
				if(x == -1) {
					System.out.println("== 파일 저장 완료 ==");
					break;
				}
				// writer.write(x);
				writer.write(data, 0, x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				// Stream Close
				try {
					if(reader != null) {
						reader.close();
					}
					if(writer != null) {
						writer.close();
					}
				} catch (IOException e) { }
		}
		
		
		
		
		
		
		
		
		
		
	}
}
