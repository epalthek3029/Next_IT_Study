import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Ex06MulticastClient {

	public static void main(String[] args) {
	
		DatagramPacket packet = null;
		MulticastSocket socket = null;
		
		try {
			socket = new MulticastSocket(10002);
			System.out.println("Cliant 생성 성공~");
			
			// 그룹에 조인
			InetAddress mcastaddr = InetAddress.getByName("224.128.1.5");
			socket.joinGroup(mcastaddr);
			
			byte[] buf = new byte[255];
			packet = new DatagramPacket(buf, buf.length);
			
			while(true) {
				socket.receive(packet);
				String msg = new String(packet.getData(), 0, packet.getLength());
				System.out.println(">수신> " + msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
