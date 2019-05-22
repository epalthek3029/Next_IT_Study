import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10DoWhile {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		// 국, 영, 수학 3과목 점수 입력 받아서 총점, 평균
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, math;
		
		do {		
			System.out.print("국어 : ");
			kor = Integer.parseInt(reader.readLine());
			if(kor < 0 || kor > 100) {
				System.out.println("점수는 0~100으로 입력하세요");
			}
		}while(kor < 0 || kor > 100);	
			
		do {
			System.out.print("영어 : ");
				eng = Integer.parseInt(reader.readLine());
			if(eng < 0 || eng > 100) {
				System.out.println("점수는 0~100으로 입력하세요");
			}
		}while(eng < 0 || eng > 100);
			
		do {	
		System.out.print("수학 : ");
			math = Integer.parseInt(reader.readLine());
			if(math < 0 || math > 100) {
				System.out.println("점수는 0~100으로 입력하세요");
			}
		}while(math < 0 || math > 100);
		// 총점
		int total = kor + eng + math;
				
		// 평균
		float evg = total / 3.0f;
		
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.printf("%d\t %d\t %d\t %d\t %.2f", kor, eng, math, total, evg);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
