import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03FileInOutStream {

	public static void main(String[] args) {
		
		
		
		File file = new File("/home/pc26/IO/sample.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			// #1. Open(스트림 연결)
			fos = new FileOutputStream(file);
			fis = new FileInputStream("src/Ex03FileInOutStream.java");
			
			// #2. Read / Write
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			
			byte[] data = {' ', 'J', 'A', 'V', 'A'};
			fos.write(data);
			
			System.out.println("=== 파일 출력 완료 ===");
			
			// 데이터 읽기
			
			data = new byte[fis.available()];
			
			while(true) {
//				int x = fis.read();	// 0 ~ 255 아스키코드
				int x = fis.read(data);	// 읽어 들인 바이트 수를 리턴.
				if(x == -1) {
					System.out.println("== 파일의 끝에 도달했습니다. ==");
					break;
				}
//				System.out.print((char)x);
				System.out.println(new String(data, 0 , x));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// #3. Close(자원해제)
			try {
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {}
		}
		
	}
}
