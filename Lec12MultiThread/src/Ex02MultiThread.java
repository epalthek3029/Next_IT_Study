
class RunnableThread implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 명 : "  + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}
}

public class Ex02MultiThread {

	public static void main(String[] args) {
		
		System.out.println("===== 프로그램 시작 =====");

		// 스레드 생성 및 기동
		RunnableThread target = new RunnableThread();
		
		Thread thread1 = new Thread(target);
		thread1.setName("이산");
		
		Thread thread2 = new Thread(target, "설현");
		
		thread1.start();
		thread2.start();
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("### 스레드 명 : "  + Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {}
				}
			}
		});

		thread3.setName("문별");
		thread3.start();
		
		System.out.println("===== 프로그램 종료 =====");
	}
}
