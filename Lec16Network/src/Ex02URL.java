import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex02URL {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://www.naver.com:443/index.html?user_name=이산");
		
		System.out.println("protocol : " + url.getProtocol());
		System.out.println("host : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("Path : " + url.getPath());
		System.out.println("Query : " + url.getQuery());
		
		// 원격 자원 연결
		URLConnection urlConn = url.openConnection();
		
		InputStream in = urlConn.getInputStream();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		
		while(true) {
			String str = reader.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
	}
}
