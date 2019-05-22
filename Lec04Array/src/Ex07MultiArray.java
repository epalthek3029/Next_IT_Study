
public class Ex07MultiArray {
	
	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		
		a[0][0] = 3;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 6;
		a[1][2] = 8;
		disp(a);
		
		int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		disp(b);
		
		int[][] c = new int[3][]; // 열의 개수는 안정해도 됨
		c[0] = new int[5];
		c[1] = new int[3];
		c[2] = new int[4];
		disp(c);
		
		
	}
	
	public static void disp(int[][] arr) {
		
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j ++) {
					System.out.print("[" + arr[i][j] + "]");
				}
				System.out.println();
			}
			System.out.println("==========================");
	}
	
	

}
