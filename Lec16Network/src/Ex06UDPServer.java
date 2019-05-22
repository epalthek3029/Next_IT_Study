import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Ex06UDPServer {

	public static void main(String[] args) {
		
		DatagramPacket packet = null;
		DatagramSocket socket = null;
		
		try {
			socket = new DatagramSocket();
			System.out.println("서버 소켓 생성");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			byte[] buf = new byte[512];
			
			while(true) {
				System.out.println("입력 : ");
				String msg = reader.readLine();
				
				if(msg == null) {
					break;
				}
				
				// 0, 1, 는 사용 잘 안함 255는 브로드케스트
//				for (int i = 2; i <= 254; i++) {
					InetAddress address = InetAddress.getByName("192.168.10.255" /*+ i*/);
					packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10000);

					socket.send(packet); // 데이터 전송
//				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
