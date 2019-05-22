import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Ex06MulticastServer {

	public static void main(String[] args) {
		
		DatagramPacket packet = null;
		MulticastSocket socket = null;
		
		try {
			socket = new MulticastSocket();
			System.out.println("서버 소캣 생성");
			
			/*
			 IPv4, 192.168.10.2, 32bit
			  (등급)  (8비트)
			 A클래스 : 0000	: 0.0.0.0 ~   127.255.255.255 , N.H.H.H (ex.. 10.120.20.30)  국가망
			 B클래스 : 1000	: 128.0.0.0 ~ 191.255.255.255 , N.N.H.H (ex.. 128.120.20.35) 대학교..?
			 C클래스 : 1100	: 192.0.0.0 ~ 223.255.255.255 , N.N.N.H (ex.. 192.168.10.2) 소규모 네트워크
			 D클래스 : 1110	: 224.0.0.0 ~ 239.255.255.255 , N/A		멀티캐스트 영역
			 E클래스 : 1111	: 240.0.0.0 ~ 255.255.255.255 , N/A		연구용, 예약된 주소
			*/
			
			InetAddress address = InetAddress.getByName("224.128.1.5");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("입력 : ");
				
				String msg = reader.readLine();

				if(msg == null) {
					break;
				}
				
				packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, address, 10002);
				socket.send(packet);
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
