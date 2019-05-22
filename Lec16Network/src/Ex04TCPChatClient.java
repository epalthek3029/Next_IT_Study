import java.io.IOException;
import java.net.Socket;

public class Ex04TCPChatClient {

	public static void main(String[] args) {

		Socket soc = null;

		try {
			soc = new Socket("192.168.10.28", 9001);
			System.out.println("클라이언트 접속 성공.. : " + soc.getRemoteSocketAddress());

			SenderThread sender = new SenderThread(soc);
			ReceiverThread receiver = new ReceiverThread(soc);

			sender.start();
			receiver.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
