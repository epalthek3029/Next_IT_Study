class SampleThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("스레드 명 : " + Thread.currentThread().getName());
		
		for(int i = 0; i < 40; i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(100);	
			} catch(InterruptedException e) {}
		}

	}
}

public class Ex01MultiThread {

	public static void main(String[] args) {
		
		System.out.println("===== 프로그램 시작 =====");
		System.out.println("main : " + Thread.currentThread().getName());
		
		// 스레드 생성 및 기동
		SampleThread thread = new SampleThread();
		thread.setName("Number Thread");
		thread.setDaemon(true); // 데몬스레드
		thread.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
			
			try {
				Thread.sleep(100);	
			} catch(InterruptedException e) {}
		}
		
		System.out.println("\n===== 프로그램 종료 =====");
	}
}
