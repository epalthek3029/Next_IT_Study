

public class Ex03SynchMain {

	//공유자원
	public static Bank bank = new Bank();
	
	public static void main(String[] args) {
		
		System.out.println("==== 프로그램 시작 ====");
		
		Husband h = new Husband("이산");
		Wife w = new Wife("문별");
		
		h.start();
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		 w.start();
		
		System.out.println("==== 프로그램 종료 ====");
		
		
		
	}
			
}
