import java.util.Vector;

public class VideoShop {

	Vector<String> videoList = new Vector<String>();
	
	VideoShop(){
		
		videoList.add("왕좌의 게임 1 - 1");
		videoList.add("왕좌의 게임 1 - 2");
		videoList.add("왕좌의 게임 1 - 3");
		videoList.add("왕좌의 게임 1 - 4");
	}
	
	public synchronized String lenVideo() {
		
		while(videoList.size() == 0) {
			//return null;
			try {
				System.out.println(Thread.currentThread().getName() + "대기중...ㅊ");
				wait();
			} catch (InterruptedException e) {}
		}
		String video = videoList.remove(videoList.size()-1);
		
		return video;
	}
	
	public synchronized void returnVideo(String video) {
		videoList.add(video);
		//notify();
		notifyAll();
		
	}
}
