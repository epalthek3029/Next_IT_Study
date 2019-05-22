
public class SMSSender extends MessageSender {

	String returnPhoneNo; // 회신전화번호
	String message; // 메시지

	SMSSender(String titlbe, String senderName, String returnPhoneNo, String message) {
		super(titlbe, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println(">>>>>>>>>>>>>> SMS send <<<<<<<<<<<<<<");
		System.out.println("제      목 : " + title);
		System.out.println("발  신  자 : " + senderName);
		System.out.println("수  신  자 : " + recipient);
		System.out.println("회신  전화 : " + returnPhoneNo);
		System.out.println("메시지본문 : " + message);
		System.out.println();
	}

}
