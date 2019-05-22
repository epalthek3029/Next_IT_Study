
public class Ex01Lambda {

	public static void main(String[] args) {
		
		// 기존방식
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("=== Anonymous Inner Class ===");
			}
		});
		
		thread.start();
		
		// 람다식
		Thread thread2 = new Thread(()->{
			System.out.println("=== Lambda Expression ===");
		});
		
		thread2.start();
		
		/*
		// 위 식이 한줄이므로 {} 를 지워서 한줄로 만들 수 있다.람다식
				Thread thread2 = new Thread(()->	System.out.println("=== Lambda Expression ==="));
				
				thread2.start();
		*/
	}
	
	
	
	
	
}
