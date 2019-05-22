import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01InetAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println("=== 로컬 시스템 정보 ===");
		
		InetAddress local = InetAddress.getLocalHost();
		
		System.out.println("getHostName() : " + local.getHostName());
		System.out.println("getHostAddress() : " + local.getHostAddress());
		System.out.println("getLoopbackAddress() : " + local.getLoopbackAddress());
		
		InetAddress remote = InetAddress.getByName("www.naver.com");
		
		System.out.println("getHostName() : " + remote.getHostAddress());
		System.out.println("getHostAddress() : " + remote.getHostAddress());
		
		
		
		System.out.println("=== 원격 시스템 정보 2 ===");
		
		InetAddress[] remotes = InetAddress.getAllByName("www.naver.com");
		
		for(int i = 0; i < remotes.length; i++) {
			System.out.println("getHostAddress() : " + remotes[i].getHostAddress());
		}
		
	}
}
