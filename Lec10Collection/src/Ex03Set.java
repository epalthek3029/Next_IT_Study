import java.util.HashSet;
import java.util.Iterator;

public class Ex03Set {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("강정현");
		set.add("박소희");
		set.add("김도아");
		set.add("길현종");
		
		System.out.println(set);	// 순서 개념 없음.
		
		set.add("박소희");	// 데이터 중복 불가
		
		System.out.println(set);
		
		// 반복자(Iterator)
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		
		
	}
}
