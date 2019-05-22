
public class VideoShopMain {

	//공유자원
	public static VideoShop videoshop = new VideoShop();
	
	public static void main(String[] args) {
	
		System.out.println("===== 프로그램 시작 =====");
		Customer c1 = new Customer("이재학");
		Customer c2 = new Customer("연초희");
		Customer c3 = new Customer("김다슬");
		Customer c4 = new Customer("도민석");
		Customer c5 = new Customer("김상현");
		Customer c6 = new Customer("정지수");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		
		System.out.println("===== 프로그램 종료 =====");
	}
}
