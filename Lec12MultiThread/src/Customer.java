
public class Customer extends Thread{

	Customer(String name){
		super(name);
	}
	
	@Override
	public void run() {
	
		//synchronized(VideoShopMain.videoshop) {
		
		String video = VideoShopMain.videoshop.lenVideo();
		if(video == null) {
			System.out.println(Thread.currentThread().getName() + " 가 대여 실패");
			return;
		}
		
		System.out.println(Thread.currentThread().getName() + " 가 " + video + " 대여 ");

		System.out.println(Thread.currentThread().getName() + " 가 " + video + " 보는 중 ");
		
		int x = (int)(Math.random() * 3) +1;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		VideoShopMain.videoshop.returnVideo(video);
		
		System.out.println(Thread.currentThread().getName() + " 가 " + video + " 반납 ");
		//}
	}
}
