import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02File {
	
	public static void main(String[] args) throws IOException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		String today = dateFormat.format(new Date());
		
		File parent = new File("/home/pc26/IO/" + today);
		
		if(parent.exists()) {
			System.out.println(parent.getPath() + " 존재한다.");
		} else {
			System.out.println(parent.getPath() + " 존재하지않는다.");
			
			if(parent.mkdirs()) {
				System.out.println(parent.getPath() + " 생성 성공");
			}
		}
		
		File file = new File(parent, "sample.txt");
		
		if(file.exists()) {
			System.out.println(file.getPath() + " 존재한다.");
		} else {
			System.out.println(file.getPath() + " 존재하지 않습니다.");
			
			if(file.createNewFile()) {
				System.out.println(file.getPath() + " 생성 성공");
				
			}
			file.setReadOnly(); // 읽기 전용이라 사용자 변경이 x
		}
	}
}
