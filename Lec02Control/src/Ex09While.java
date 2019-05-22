import java.io.IOException;

public class Ex09While {
	
	public static void main(String[] args) throws IOException {
		
		/*
		// 1 ~ 10 까지의 합
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;			
		}
		System.out.println("1 부터 100 까지의 합은 " + sum);
		
		sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("1 부터 100 까지의 합은 " + sum);
		
		// for 문의 구구단
		
		for(int j = 2; j <= 9; j++) {
			System.out.println("=====" + j + "=====");
			for(int k = 1; k <= 9; k++) {
				System.out.println(j + " * " + k + " = " + (j*k));
			}
		}
		
		// while 문의 구구단
		int m = 2;		
		while(m <= 9) {
			System.out.println("=====" + m + "단=====");
			int n = 1;
			while(n <= 9) {
				System.out.printf("%d * %d = %d\n", m , n ,(m*n));
				n++;
			}
			m++;
		}
		*/
		
		System.out.print("메시지를 남겨주에요 : ");
		
		while(true) {
			int x = System.in.read(); // 1byte(0 ~ 255), -1
			if(x == -1) {
				System.out.println("입력을 종료합니다.(" + x + ")");
				break;
			}
			System.out.print((char)x);
		}
		System.out.print("프로그램 종료"); // ctrl + d 빠져나옴
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
