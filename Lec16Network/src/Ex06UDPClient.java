import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Ex06UDPClient {

	public static void main(String[] args) {
		
		DatagramPacket packet = null;
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket(10000);
			System.out.println("클라이언트 생성 성공");
			
			byte[] buf = new byte[512];
			packet = new DatagramPacket(buf, buf.length);
			
			while (true) {
				socket.receive(packet); // 데이터 수신
				String msg = new String(packet.getData(), 0, packet.getLength());
				System.out.println("수신 >" + msg);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
