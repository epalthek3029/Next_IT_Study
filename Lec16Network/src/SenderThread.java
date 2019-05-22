import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SenderThread extends Thread{
	
	Socket soc;
	String nickName;
	
	// 생성자
	SenderThread(Socket soc){
		this.soc = soc;
	}
	
	SenderThread(Socket soc, String nickName){
		this.soc = soc;
		this.nickName = nickName;
	}
	
	@Override
	public void run() {
		
		try {
			
			// 키보드 입력 -> 소켓 출력
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(soc.getOutputStream());
			
			// 닉네임 전송
			if(nickName != null && !nickName.isEmpty()) {
				writer.println(nickName);
				writer.flush();
			}
			
			while(true) {
				System.out.println("입력.. : ");
				
				String msg = reader.readLine();
				
				if(msg == null) {
					System.out.println("=== 접속을 종료합니다. ===");
					break;
				}
				writer.println(msg);
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			 try {
				if(soc != null) soc.close();
			} catch (IOException e) {}
		}
	}
}
