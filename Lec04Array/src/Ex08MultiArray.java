import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08MultiArray {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 국, 영, 수학 3과목 점수 입력 받아서 총점, 평균
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String[] subject = {"국어", "영어", "수학"};
		String[] student = {"아귀", "영수", "수영"};
		int[][] score = new int[student.length][subject.length + 1];
		
		float[] avg = new float[student.length];	// 평균
		int[] rank = new int[student.length]; 		// 등수
		
		for(int i = 0; i < student.length; i++) { // 학생을 대리고 행에 적용
			for(int j = 0; j < subject.length; j++) { // 그 학생에 대한 성적 컬럼
				do {
				System.out.print(subject[j] + " : ");
				score[i][j] = Integer.parseInt(reader.readLine());
					if(score[i][j] < 0 || score[i][j] > 100) {
					System.out.println("점수는 0~100으로 입력하세요");
					}
				}while(score[i][j] < 0 || score[i][j] > 100);
								
				// 총점
				score[i][score[i].length - 1] += score[i][j];
			}
			// 평균							
			avg[i] = score[i][score.length - 1] / (float)subject.length;
			// 등수 초기화
			rank[i] = 1;
		}
		
		// 등수 구하기
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < student.length; j++) {
				if(score[i][score[i].length -1] < score[j][score[j].length - 1]) {
					rank[i]++;
				}
			}
		}
		
		System.out.println("=======중간고사 성적표==========");
		System.out.print("이름\t");
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");			
		}
		System.out.println("총점\t평균\t등수");
		
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i] + "\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.2f\t%d\n", avg[i],rank[i]);
		}
		
		
		
		
	}

}
