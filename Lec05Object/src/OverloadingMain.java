
class Calculator{
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multiply(int x, int y) {
		return x * y;
	}
	public int divide(int x, int y) {
		return x / y;
	}
}

public class OverloadingMain {

	public static void main(String[] args) {
		
		int a = 1230;
		int b = 5456;
		
		Calculator calc = new Calculator();
		
		int c = calc.plus(a, b);
		System.out.println("c = " + c);
		
//		float d = calc.plus(3.14f, 5.14f);
		
		
		
	}
}
