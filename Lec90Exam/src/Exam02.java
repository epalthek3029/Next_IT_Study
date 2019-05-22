import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam02{

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 문자 읽어드리기
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int kor = getScore("국어", reader);
		int eng = getScore("영어", reader);
		int math= getScore("수학", reader);
		
		// 사용자로부터 입력 받은 값의 총합
		int total = kor + eng + math;
						
		// 사용자로부터 입력 받은 값의 평균
		double evg = total / 3.0;
		
		// 기준에 의해 평균값을 넣어 등급 구하기
		char grade = ' ';
		
		if(evg >= 90) {
			grade = 'A';
		} else if(evg >= 80) {
			grade = 'B';
		} else if(evg >= 70) {
			grade = 'C';
		} else if(evg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// 출력란
		System.out.println("국 어\t 영 어\t 수 학\t 총 합\t 평 균\t 등 급");
		System.out.printf("%d\t %d\t %d\t %d\t %.2f\t %c", kor, eng, math, total, evg, grade);	
	}
	
	public static int getScore(String subject, BufferedReader reader) throws NumberFormatException, IOException{
		
		int score = 0;
		
		// 사용자가 시험 점수를 잘못 입력하면 오류 메시지가 뜨고 다시 입력 할 수 있도록
		do {		
			System.out.print(subject + " : ");
			score = Integer.parseInt(reader.readLine());
			if(score < 0 || score > 100) {
				System.out.println("오류 : 점수를 0 부터 100 사이의 수만 입력하시오!!");
			}
		}while(score < 0 || score > 100);
		
		return score;
	}
}