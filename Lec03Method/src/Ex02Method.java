import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02Method {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		// 국, 영, 수학 3과목 점수 입력 받아서 총점, 평균
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int kor = getScore("국어", reader);
		int eng = getScore("영어", reader);
		int math= getScore("수학", reader);
		
		// 총점
		int total = kor + eng + math;
				
		// 평균
		float evg = total / 3.0f;
		
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.printf("%d\t %d\t %d\t %d\t %.2f", kor, eng, math, total, evg);	
	}
	
	public static int getScore(String subject, BufferedReader reader) throws NumberFormatException, IOException{
		
		int score = 0;
		do {		
			System.out.print(subject + " : ");
			score = Integer.parseInt(reader.readLine());
			if(score < 0 || score > 100) {
				System.out.println("점수는 0~100으로 입력하세요");
			}
		}while(score < 0 || score > 100);
		return score;
	}
}