import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06BufferedInOutStream {

	public static void main(String[] args) {
		
		File source = new File("/home/pc26/IO/StayWithMeMV2.m4v");
		File target1 = new File("/home/pc26/IO/StayWithMeMV2-1.m4v");
		File target2 = new File("/home/pc26/IO/StayWithMeMV2-2.m4v");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//일반 스트림의 성능 측정.
			fis = new FileInputStream(source);
			fos = new FileOutputStream(target1);
			
			System.out.println("#1. 일반 스트림 성능 측정");
			long startTime = System.currentTimeMillis();
			
			while(true) {
				int x = fis.read();
				
				if(x == -1) {
					break;
				}
				fos.write(x);
				
			}
			long duration = System.currentTimeMillis() - startTime;
			
			System.out.println("경과 시간 : " + duration);
			
			bis = new BufferedInputStream(new FileInputStream(source));
			bos = new BufferedOutputStream(new FileOutputStream(target2));
			
			System.out.println("#2. 버퍼링  성능 측정");
			
			startTime = System.currentTimeMillis();
			while(true) {
				int x = bis.read();
				if(x == -1) {
					break;
				}
				bos.write(x);
			}
			
//			bos.flush();	// 버퍼에 남은 데이터를 출력함.
			
			duration = System.currentTimeMillis() - startTime;
			System.out.println("경과 시간 : " + duration);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fis != null) fos.close();
				if(fis != null) bis.close();
				if(fis != null) bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
