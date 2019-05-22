import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02IFStmt {

	public static void main(String [] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	
		System.out.print("국어의 점수를 입력 해 주세요 : ");
			int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어의 점수를 입력 해 주세요 : ");
			int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학의 점수를 입력 해 주세요 : ");
			int math = Integer.parseInt(reader.readLine());
		
		//총점
		int sum = kor + eng + math;
		//평균
		float avg =(kor + eng + math)/3.0F;
		//등급
				/*	국어, 영어, 수학 3과목의 점수를 입력 받아, 총점, 평균 구하기.
					95점 이상 A+, 90점 이상 A
					85점 이상 B+, 80점 이상 B
				 	75점 이상 C+, 70점 이상 C
				 	65점 이상 D+, 60점 이상 D
				 	60점 미만 F */
		String grade = "";
		/*		
		if(avg >=95) {
			grade = "A+";
		} else if(90 <= avg){
			grade = "A";
		} else if(85 <= avg){
			grade = "B+";
		} else if(80 <= avg){
			grade = "B";
		} else if(75 <= avg){
			grade = "C+";
		} else if(70 <= avg){
			grade = "C";
		} else if(65 <= avg){
			grade = "D+";
		} else if(60 <= avg){
			grade = "D";
		} else {
			grade = "F";
		*/
		
		if(avg >=90) {
			grade = "A";
		} else if(80 <= avg){
			grade = "B";
		} else if(70 <= avg){
			grade = "C";
		} else if(60 <= avg){
			grade = "D";
		} else {
			grade = "F";
		}
		
		if(avg >= 65 && avg % 10 >= 5 || avg == 100) {
			grade = grade + "+";
		}
		
		System.out.println("=================중간고사 성적표=====================");
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균\t 성적");
		System.out.printf("%d\t %d\t %d\t %d\t %.2f\t %s", kor, eng, math, sum, avg, grade);
		
		
	}		
}

