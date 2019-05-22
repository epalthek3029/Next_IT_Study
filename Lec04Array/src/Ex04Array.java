
public class Ex04Array {

	public static void main(String[] args) {
		
		int[] num = new int[30];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 10); // 0 ~ 9
			System.out.print(num[i] + ", ");	
		}System.out.println();
		
		// { 0, 0, 7, 1, 2, 6, 9, 4, 8, 6, 5, 4, 8, 9, 8, 2, 1, 2, 7, 7, 6, 3, 6, 2, 4, 8, 2, 9, 2, 4,  }
		
		// 각각의 숫자 몇번 발생하는지 카운트,
		// 0 : 3회
		// 1 : 2회
		// 2 : 1회
		// .
		// .
		// 9 : 2회
		
		
		// 카운트를 담을 공간이 필요
		
		int[] count = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			count[num[i]]++;			
		}
		for(int i = 0; i < count.length; i++) {
			System.out.println(i + " : " + count[i] + "회");
		}
	}
}
