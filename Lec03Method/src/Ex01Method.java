
public class Ex01Method {
	
	public static void main ( String [] args) {
		
		// public > protected > default > private
		// void 리턴 할 데이터가 없다.
		// ( 매개변수)
		
		int a =10;
		int b =20;
		
		int c = sum(a, b); // 메서드 호출(call)
		
		System.out.println("결과 : " + c);
		
		int x = Integer.parseInt("150"); // 메서드 호출
		
		// Call by Value
		x = 15;
		int z = makeDouble(x);
		System.out.println("main x : " + x); // main 에서의 x는 15 이지만 makeDouble 메서드에서의 x는 30이다.
		
		// Call by Reference
		StringBuffer sb = new StringBuffer("JAVA 라고 쓰고"); // 0x1500 : "JAVA 라고 쓰고"
		printMessage(sb);
		System.out.println("main sb = " + sb);
	}
	
	public static void printMessage(StringBuffer sb) {
		
		sb.append(" 껌이라고 읽는다.");
		System.out.println("printMessage sb = " + sb);		
	}
	
	public static int makeDouble(int x){
		
		x = x * 2;
		System.out.println("makeDouble x = " + x);
		return x;
	}
		
	// 메서드 선언(정의)
	public static int sum(int x, int y){
	
		int result = x + y;
		return result;
	}
	
	
	
	
}
