
public class YoonEx6_2 {

	public static void main(String[] args) {
	
		// 변수의 스코
		boolean ste = true;
		int num1 = 11;
		
		if(ste) {
			//int num1 = 22; // 주석 해제하면 컴파일 오류 발생
			num1++;
			System.out.println(num1);
		}
		{
			int num2 = 33;
			num2++;
			System.out.println(num2);
		}
		//System.out.println(num2);	// 주석 해제하면 컴파일 오류 발생
		
		// 메소드의 재귀 호
		System.out.println("3 factorial : " + factorial(3));
		System.out.println("12 factorial : " + factorial(12));
		System.out.println("---------------------------");
		
		// 잘못된 재귀 메소드의 정의
		showHi(3);
		System.out.println("---------------------------");
		
		System.out.println(numberTwo(8));
		System.out.println("---------------------------");
		
		toBinary(100);
		
		System.out.println();
	}
	
	public static int factorial(int n) {
		if(n == 1)
			return 1;
		else 
			return n * factorial(n-1);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi~");
		if(cnt == 1)
			return;
		showHi(cnt-1);
	}
	
	// 문제 6-3
	// 1. 인자로 정수 n을 전달받아서 2의 n승을 계산하여 반환하는 메소드를 재귀의 형태로 정의하고,
	//    이를 호출하는 main 메소드를 정의해보자.
	public static int numberTwo(int n) {
		int db = 1;
		for (int i = 1; i <= n; i++) {
			db *= 2;
		}
		return db;
	}
	// 2. 인자로 십진수 정수를 전달받아서 이에 해당하는 이진수 표현을 출력하는 메소드를 재귀의 형태로 정의하고,
	//    이를 호출하는 main 메소드를 정의해보자
	public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            
            toBinary(decimal);
            System.out.print(bin);
        }
        return 0;
    }
	
}
