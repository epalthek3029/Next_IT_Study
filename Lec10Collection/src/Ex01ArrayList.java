import java.util.ArrayList;

public class Ex01ArrayList {

	public static void main(String[] args) {
		
		// Generic
		ArrayList<String> list = new ArrayList();	// int[] num = new int[5];
		
		// ArrayList<E>	//Element로 사용된다.
		
		list.add("한아름");
		list.add("한태희");
		list.add("방권호");
		list.add(new String("구대명"));
		
		// list.add(new Integer(120));
		
		System.out.println(list);	// 순서 개념이 존재.
		
		list.add("한태희");
		
		System.out.println(list);	// 데이터 중복 가능.
		
		if(list.add("방권호")) {
			System.out.println("존재합니다.");
		}
		if (list != null && !list.isEmpty()) {
			/*
			for (int i = 0; i < list.size(); i++) {
				String name = list.get(i); // num[i], douwncasting
				System.out.println(name);
			}
			*/
			
			// foreach, advanced for문
			for(String name : list) {
				System.out.println(name);
			}
		}

	}
}
