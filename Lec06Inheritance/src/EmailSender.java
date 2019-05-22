
public class EmailSender extends MessageSender {

	String senderAddr; // 발신자 이메일
	String emailBody; // 메일 본문

	EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
		System.out.println(">>>>>>>>>>>>>> e-mail send <<<<<<<<<<<<<<");
		System.out.println("제      목 : " + title);
		System.out.println("발  신  자 : " + senderName);
		System.out.println("수  신  자 : " + recipient);
		System.out.println("발신자주소 : " + senderAddr);
		System.out.println("이메일본문 : " + emailBody);
		System.out.println();
	}

}
