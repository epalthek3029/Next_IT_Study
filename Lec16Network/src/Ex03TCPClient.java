import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex03TCPClient {
	
	public static void main(String[] args) {
		
		Socket soc = null;
		
		try {
			soc = new Socket("192.168.10.18",9000);
			System.out.println("클라이언트 접속 성공띠~ " + soc.getRemoteSocketAddress());
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			
			while(true) {
				System.out.println("입력 : ");
				String msg = reader.readLine();
				
				if(msg == null) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				
				writer.write(msg + "\n");
				writer.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				if(soc != null) {
					soc.close();
				}
			} catch (IOException e) {}
		}
	}
}