
public class Ex03Array {

	public static void main(String[] args) {
		
		// 로또 예제 : 1 ~ 45, 6개 추출
		
		int[] lotto = new int[45];
				
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (i + 1);
			System.out.print(lotto[i] + ", ");
		}System.out.println();
		
		// {1, 2, 3, 4, 5, 6 ... 44, 45, }
		
		// 첫번째 요소와 임의의 요소를 100번정도 섞는다
		int temp;
		for(int i = 0; i < 100; i++) {
			
			int idx =(int)(Math.random() * lotto.length);
			temp = lotto[0];
			lotto[0] = lotto[idx];
			lotto[idx] = temp;
		}
		// 로또번호 추출
		System.out.println("===이번주 로또 번호===");
		for(int i = 0; i < 6; i++) {
			System.out.printf(lotto[i] + " ");
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
	}
}
