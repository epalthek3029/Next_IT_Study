import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04FileInOutStream {

	public static void main(String[] args) {
		
		File source = new File("/home/pc26/IO/gnome-tyr_02.png");
		File target = new File("/home/pc26/IO/gnome-tyr_02_copy.png");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// Stream Open
			fis = new FileInputStream(source);
			fos = new FileOutputStream(target);
			
			// Read / Write
			
			byte[] data = new byte[256];
			
			while(true) {
//				int x = fis.read();
				int x = fis.read(data);
				if(x == -1) {
					System.out.println("파일복사 완료");
					break;
				}
//				fos.write(x);
				fos.write(data, 0,	 x);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			
			// Stream Close
			try {
			if(fis != null){
				fis.close();
			}
			if(fos != null) {
				fos.close();
			}
			} catch(IOException e) {}
		}
		
		
	}
}
