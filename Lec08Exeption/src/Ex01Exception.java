import java.io.IOException;

public class Ex01Exception {

	// args : Command Line Parameter
	public static void main(String[] args) {
		
		/*	
		// if 로 조건 부여 
		if(args != null && args.length == 2) {
		System.out.println(args[0] + "안녕.");
		System.out.println(args[1] + "방가방가.");
		}
		*/
		
		/*
		// Unchecked Exception
		try {
		System.out.println(args[0] + "안녕.");
		System.out.println(args[1] + "방가방가.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage : java Ex01Exception 이름 이름");
		}
		System.out.println(">>>>>프로그램 정상 종료<<<<<");
		*/
		
		/*
		int result = 0;
		for(int i = 0; i < 10; i++) {
			try{
				int x = (int)(Math.random() * 10); // 0 ~ 9
				result = 15 / x;
				System.out.println(i + " : " + result);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				i--;
			}
		}
		System.out.println(">>>>>프로그램 정상 종료<<<<<");
		*/
		
		// Checked Excption
		
		try {
			System.out.println("입력 : ");
			int x = System.in.read();
			System.out.println("데이터 = " + (char)x);
		}catch(IOException e) {
			System.out.println("입출력 에러 발생.");
		}
		
		
		
		System.out.println(">>>>>프로그램 정상 종료<<<<<");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}