import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03IFStmt {
	
	public static void main(String[] args) throws IOException {
				
		// 특정 년도를 입력받아, 행당 년이 윤년인지 평년인지 판별하시오.
		// 1조건 : 4년마다 발생. 해당 년을 4로 나누어 떨어지면 윤년.
		// 2조건 : 1의 조건을 만족하는 것 중, 100년 마다 평년. 해당 년이 100으로 나누어 떨어지면 평년.
		// 3조건 : 2의 조건을 만족하는 것 중, 400년 마다 윤년. 해당 년이 400으로 나누어 떨어지면 윤년.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도를 입력 :");
		
		int year = Integer.parseInt(reader.readLine());

		/*
		if((year%4) == 0){
			if((year%100) == 0) {
				if((year%400) == 0)
				{	System.out.print("윤년");} 
				else 
				{	System.out.print("평년");}
			} 
			else 
			{System.out.print("윤년");}
		} 
		else 
		{System.out.print("평년");}
		*/
		
		
		/*
		String Moon ="";
		if( (year%4) == 0 ){
			if( (year%100) == 0 ) {
				if( (year%400) == 0 ) {	
					Moon = "윤년";
				} else {	
					Moon = "평년";
					}
			} else { 
				Moon = "윤년";
				}
		} else {
			Moon = "평년";
			}
		
		System.out.printf("%d 년은 %s 입니다.", year, Moon);
		*/
		
		
		/*
		String Moon ="";
		if((year%4) == 0){
			Moon = "윤년";
			}
		 else if((year%100) == 0) {
			 Moon = "평년";
			 }
		 else if((year%400) == 0) {	
			 Moon = "윤년";
			 } 
		 else {
			 Moon = "평년";
		 }
		System.out.printf("%d 년은 %s 입니다.", year, Moon);
		*/
		
		
		
		String Moon ="평년";
		
		if(year%4 == 0 && year%100 != 0 || year % 400 == 0) {
			Moon ="윤년";
		}
		
		// 해당 년까지 윤년의 횟수 구하기
		int leapYearCnt = (year / 4) - (year / 100) + (year / 400);
		
		System.out.printf("%d 년은 %s 입니다.(%d회)", year, Moon, leapYearCnt);
		
		/*
		 * 변수 : a
		 * 심벌릭 상수 : b
		 * 리터럴 상수 : 10, 20, 'a', 3.14f, "문자열"
		 * 
		 * int a = 10;
		 * a = 20;
		 * 
		 * final int b = 30; > 상수
		 * b = 40; > error
		 * char ch = 'a'; > 문자형 리터럴
		 * float f = 3.14f;
		 * String str = "문자열"; > 문자열 리터럴 */
		
		
		
		
		
		
		
		
		
	}
}
