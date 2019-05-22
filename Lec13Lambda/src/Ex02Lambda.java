
public class Ex02Lambda {

	public static void main(String[] args) {
		
		// 기존방식
		MyFuncionalInterface mfi = new MyFuncionalInterface() {
			@Override
			public int method(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("기존방식 : " + mfi.method(10, 20));
		
		// 람다식
		mfi = (a, b)-> {
			return a + b;
		};
		System.out.println("람다식 #1 : " + mfi.method(30, 15));
		
		// 위 식을 줄
		mfi = (a, b)-> {return a - b;};
		System.out.println("람다식 #2 : " + mfi.method(55, 15));
		
		mfi = (a, b) -> a * b;
		System.out.println("람다식 #3 : " + mfi.method(2, 3));
		
		
	}
}
