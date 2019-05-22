
public class Ex05ForStmt {

	public static void main(String [] ags) {
		
		// 1 ~ 10 까지의 합
		int sum = 0;
		
	/*	반복문을 모를때..
				
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		///
		sum = sum + 9;
		sum = sum + 10;
	*/
		
		for(int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 10 의 합은 : " + sum);
		
		// A ~ Z
		for(char ch = 'A'; ch < 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		
		// 1 ~ 100
		sum= 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("1 ~ 100 까지 3의 배수의 합 : " + sum);
		
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i%3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1 ~ 100 까지 3의 배수의 합 : " + sum);
		
		/*
		// 구구단 예제
		for(int j =2; j<10; j++) {
			System.out.println(j + "단");
			for(int i = 1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", j, i, j*i );
			}
		}
		*/
		
		//********
		for(int j = 0; j <10; j++) {
			for(int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
