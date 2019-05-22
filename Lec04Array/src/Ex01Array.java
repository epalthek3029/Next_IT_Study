
public class Ex01Array {
	
	public static void main(String[] arg) {
		
		// 배열 선
		int[] arr1; // 윗쪽 패턴이 좋을
		
		// 배열 생성
		arr1 = new int[5]; // 0x1500,new 키워드 : 힙(Heap)영역에 메모리 동적할당. 객체 생성, 배열 생성.
		
		arr1[0] = 3;
		arr1[1] = 4;
		arr1[2] = 5;
		arr1[4] = 7;
		
		System.out.println("[0] = " + arr1[0]);
		System.out.println("[1] = " + arr1[1]);
		System.out.println("[2] = " + arr1[2]);
		System.out.println("[4] = " + arr1[4]);
		
		int[] arr2 = new int[] {1, 2, 3};
		System.out.println("[0] = " + arr2[0]);
		System.out.println("[1] = " + arr2[1]);
		System.out.println("[2] = " + arr2[2]);
		
		int[] arr3 = {11, 12, 13, 14};
		System.out.println("[0] = " + arr3[0]);
		System.out.println("[1] = " + arr3[1]);
		System.out.println("[2] = " + arr3[2]);
		System.out.println("[0] = " + arr3[3]);
		
		int[] num = new int[10];
		
		System.out.println("배열의 길이 : " + num.length);
			for(int i = 0; i < num.length; i++) { // num.length
				num[i] = (i + 1) * 3;
			}
			for(int i = 0; i < num.length; i++) {
				System.out.println(num[i] + " , ");
			}

		// 배열을 생성할 때 첨자를 이용해서 배열의 크기를 정해버리면 크기를 변경할 수 없다.		
	}

}
