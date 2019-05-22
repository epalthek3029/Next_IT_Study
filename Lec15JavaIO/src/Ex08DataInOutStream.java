import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08DataInOutStream {

	public static void main(String[] args) {
		
		File file = new File("data.dat");
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			dis = new DataInputStream(new FileInputStream(file));
			
			int[] data = {10, 12, 15, 20, 22, 25, 30, 26, 21, 19};
			
			for(int n: data) {
				dos.writeInt(n);
			}
			
			dos.flush();
			System.out.println("=== 파일 작성 완료 ===");
			while(true) {
				
				try {
					int x = dis.readInt();
					System.out.println(x);
				} catch (Exception e) {
					System.out.println("파일의 끝에 도달했습니다.");
					break;
				}
			}
			/*
			dos.writeInt(120);
			dos.writeChar('A');
			dos.writeFloat(3.14f);
			dos.writeDouble(15.23456);
			dos.writeBoolean(true);
			dos.writeUTF("문자열");
			
			dos.flush();
			
			System.out.println("=== 파일 작성 완료 ===");
			
			System.out.println("int : " + dis.readInt());
			System.out.println("char : " + dis.readChar());
			System.out.println("float : " + dis.readFloat());
			System.out.println("double : " + dis.readDouble());
			System.out.println("boolean : " + dis.readBoolean());
			System.out.println("String : " + dis.readUTF());
			*/
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
