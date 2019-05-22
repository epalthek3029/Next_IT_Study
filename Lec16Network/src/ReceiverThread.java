import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiverThread extends Thread{
	
	Socket soc;
	
	ReceiverThread(Socket soc){
		this.soc = soc;
	}
	
	@Override
	public void run() {
		
		// 소켓 입력 -> 모니터 출력
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));

			while(true) {
				String msg = reader.readLine();
				if(msg == null) {
					System.out.println("=== 접속을 종료합니다. ===");
					break;
				}
				System.out.println("수신 > " + msg);
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
