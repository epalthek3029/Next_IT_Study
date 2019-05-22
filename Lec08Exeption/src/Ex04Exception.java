import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04Exception {

	public static void main(String[] args) {

		// 국, 영, 수학 3과목 점수 입력 받아서 총점, 평균

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] subject = { "국어", "영어", "수학" };

		int[] sub = new int[subject.length + 1];

		boolean isError = false;
		for (int i = 0; i < subject.length; i++) {
			do {
				isError =false;
				try {
					System.out.print(subject[i] + " : ");
					sub[i] = Integer.parseInt(reader.readLine());
					if (sub[i] < 0 || sub[i] > 100) {
						System.out.println("점수는 0~100으로 입력하세요");
					}
					
				} catch (IOException e) {
					System.out.println("입출력 에러");
					
				} catch (NumberFormatException e) {
					System.out.println("점수는 숫자만 입력하세요.");
					isError = true;
				}
			} while (sub[i] < 0 || sub[i] > 100);

			
			// 총점 마지막 위치는 길이에 -1
			sub[sub.length - 1] += sub[i];
		}

		// 평균
		float evg = sub[sub.length - 1] / (float) subject.length;
		System.out.println("===========중간고사============");

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t 평균");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i] + "\t");
		}
		System.out.printf("%.2f", evg);
	}
}
