import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		// LinkedHashMap 순서가 있음
		
		map.put("name", "이산");
		map.put("age", 24);	// auto boxing
		map.put("gender", 'M');
		map.put("phone", "010-1234-5678");
		
		System.out.println(map);	// 순서 개념 없음.
		
		map.put("name", "웨쮀"); // 키값은 중복 x
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		
		if(map.containsKey("phone")) {
			System.out.println("전화번호 : " + map.get("phone"));
		}
		
		if(map != null && !map.isEmpty()) {
			System.out.println("데이터 존재");
		}
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyItr = keySet.iterator();
		
		while(keyItr.hasNext()) {
			String key = keyItr.next();
			System.out.println(key + "=" + map.get(key));
			
		}
		
		
		
	}
}
