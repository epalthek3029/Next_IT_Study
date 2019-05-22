import java.util.Enumeration;
import java.util.Hashtable;

public class Ex05Hashtable {

	public static void main(String[] args) {
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("이산", "010-4123-3214");
		table.put("설현", "010-8888-2212");
		table.put("티모", "010-1231-6613");
		
		Enumeration<String> keyEnum = table.keys();
		
		while(keyEnum.hasMoreElements()) {
			String key = keyEnum.nextElement();
			System.out.println(key + "=" + table.get(key));
		}
	}
}
