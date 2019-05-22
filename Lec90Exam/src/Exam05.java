import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exam05 {

	public static void main(String[] args) throws IOException {
		
		// null 값 부여
		InputStreamReader reader = null;
		OutputStreamWriter writer = null;
		
		// 키보드 입력 -> 파일 출력
		reader = new InputStreamReader(System.in);
		writer = new OutputStreamWriter(new FileOutputStream("memo.txt"));
		
		System.out.println("메모를 남져주세요~~\n종료를 원하시면 Ctrl + d 를 눌러주세요");
		
		char[] chacha = new char[256];
		while(true) {
			int len = reader.read(chacha);
			if(len == -1) {
				System.out.println("종료되었습니다~");
				break;
			}
			writer.write(chacha, 0, len);
		}
		writer.flush();
		writer.close();
	}
}