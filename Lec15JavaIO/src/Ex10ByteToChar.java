import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex10ByteToChar {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader reader = null;
		OutputStreamWriter writer = null;
		
		// 키보드 입력 -> 파일 출력
		reader = new InputStreamReader(System.in);
		writer = new OutputStreamWriter(new FileOutputStream("memo.txt"));
		
		System.out.println("메모를 남져주세요~~");
		
		char[] cbuf = new char[256];
		while(true) {
			int len = reader.read(cbuf);
			if(len == -1) {
				System.out.println("종료되었습니다~");
				break;
			}
			writer.write(cbuf, 0, len);
		}
		writer.flush();
		writer.close();
	}
}
