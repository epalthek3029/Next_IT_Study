
public class StaticBlock {
	
	static int a; // class 변수 
	static int b;
	
	static int[] num = new int[100];
	
	// 정적 초기화 블럭
	static {
		a = 20;
		b = 10;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 3;
			System.out.print(num[i] + ", ");
		}
	}
	public static void main(String[] args) {
		
		int a = Integer.parseInt("123");
	}

	
}
