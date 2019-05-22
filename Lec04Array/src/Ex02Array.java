
public class Ex02Array {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 20); // 난수발생. 0.0 <= x < 2.0
			System.out.print(num[i] + ",");
		}
		System.out.println();
		//num = {9, 6, 6, 3, 7, 9, 4, 2, 2, 7}
		
		// 배열에 있는 숫자 중에서 최소값과 최대값을 구하기
		
		int min = num[0];
		int max = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(min > num[i]) {
				min = num[i];
			}
			if(max < num[i]) {
				max = num[i];
			}			
		}System.out.printf("최대 값 : %d \n최솟 값 : %d", max, min);		
	}
}
