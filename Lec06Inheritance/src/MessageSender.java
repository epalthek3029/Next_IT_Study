// class에도 abstract도 붙여야 한다.
public abstract class MessageSender {

	String title;		// 제목
	String senderName;// 발신자
	
	MessageSender(String title, String senderName){
		this.title = title;
		this.senderName = senderName;
	}
	
	// 중괄호가 없는 이것이 추상 메서드 이다.(추상 메서드는 앞에 abstract를 붙여야 한다.)
	abstract void sendMessage(String recipient);  
	
	
	
}
