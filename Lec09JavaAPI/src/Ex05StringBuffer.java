
public class Ex05StringBuffer {

	public static void main(String[] args) {
		
		String str = "Java";
		str = str + "Programming";	// JavaProgramming
		
		System.out.println(str);	// 레퍼런스 값이 바뀐
		
		StringBuffer sb = new StringBuffer("Java Progtamming is ");
		
		System.out.println("length() : " + sb.length());
		System.out.println("capacity() : " + sb.capacity());
		
		// 문자열 조작 메서드
		System.out.println("append() : " + sb.append("껌이다.")); // 이어 붙인
		System.out.println("insert() : " + sb.insert(20, "not "));
		System.out.println("delete() : " + sb.delete(20, 24));
		
		
		String str11 = "자바는 ";
		StringBuffer str22 = new StringBuffer("자바는");
		// String
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 20000; i++) {

			str11 += "개쉽다.";
		}
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("String : " + duration);

		// StringBuffer
		startTime = System.currentTimeMillis();					// StringBuffer 가 빠르다
		for (int i = 0; i < 20000; i++) {

			str22.append("개쉽다.");
		}
		duration = System.currentTimeMillis() - startTime;
		System.out.println("StringBuffer : " + duration);
		
		String name = "이산";
		
		// 코드 검사기에서 str.length 나 str11 += "ㄴㅇㄹ" 같은걸 쓰면 걸린다. 즉 현장에서 쓰지마라
		
		
		
		
		
		
	}
	
	/*
	public final int sum(int a, int b) {
		return a + b;
	}
	*/
}
