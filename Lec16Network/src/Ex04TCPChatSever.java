import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04TCPChatSever {

	public static void main(String[] args) {
		 
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(9001);
			System.out.println("=== Server Ready...");
			
			Socket soc = server.accept();	// 클라이언트 대기
			System.out.println("접속 클라이언트 : " + soc.getRemoteSocketAddress());
			
			SenderThread sender = new SenderThread(soc);
			ReceiverThread receiver = new ReceiverThread(soc);
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
