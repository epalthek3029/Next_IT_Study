import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.sun.jmx.remote.internal.ClientListenerInfo;

public class Ex05MultiChatServer {
	
	ArrayList<Client> clientList = new ArrayList();

	// 나와 통신 할 상대방에게 전부 보내는 것
	class Client extends Thread{
		
		
		
		Socket soc;
		PrintWriter writer;
		String nickName;
		Client(Socket soc){
			this.soc = soc;
			
			try {
				writer = new PrintWriter(soc.getOutputStream());
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			// 소켓으로 입력 -> 소켓으로 출력
			try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			
			nickName = reader.readLine();
			sendAll("#" + nickName + "님이 입장하셨습니다.");
			
			while(true) {
				String msg = reader.readLine();
				
				if(msg == null) {
					System.out.println(" == 접속 종료 == ");
					break;
				}
				sendAll(nickName + "님의 말 : " + msg);
			}
			
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				clientList.remove(this);	// 클라이언트 목록에서 제거
				sendAll("#" + nickName + "님이 퇴장하셨습니다.");
				
				try {
					if(soc != null)soc.close();
				} catch (Exception e) {}
			}
		}
		
		public void sendAll(String msg) {
			// 클라이언트 전체한테 메시지 전송
			for(Client client : clientList) {
				client.writer.println(msg);
				client.writer.flush();
			}
		}
	}
	
	public void start() {
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket();
			System.out.println("== 서버 레디.. ==");
			
			// 클라이언트 접속 대기
			while (true) {
				Socket soc = server.accept();
				System.out.println("접솏한 클라이언트 " + soc.getRemoteSocketAddress());
				
				Client client = new Client(soc);
				clientList.add(client);
				client.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Ex05MultiChatServer chatServer = new Ex05MultiChatServer();
		chatServer.start();
		
	}
}
