
public class AbstractMain {

	public static void main(String[] args) {
		
		EmailSender email1 = new EmailSender(
				"결재완료", "12번가",
				"sdlkfjn@naver.com", "고객님이 구매하신 상품이 정상 결재되었습니다.");
		
		SMSSender sms1 = new SMSSender(
				"결재완료", "12번가",
				"02-1212-1212", "고객님이 구매하신 상품이 정상 결재되었습니다.");
		
		EmailSender email2 = new EmailSender(
				"결재완료", "12번가",
				"sdlkfjn@naver.com", "고객님이 구매하신 상품이 배송되었습니다.");
		
		SMSSender sms2 = new SMSSender(
				"결재완료", "12번가",
				"02-1212-1212", "고객님이 구매하신 상품이 배송되었습니다.");
		/*
		email1.sendMessage("sdlkfjn@naver.com");
		sms1.sendMessage("02-1212-1212");

		email2.sendMessage("sdlkfjn@naver.com");
		sms2.sendMessage("02-1212-1212");
		*/
		
		send(email1, "sdlkfjn@naver.com");
		send(sms1, "02-1212-6666");
		
		send(email2, "sdlkfjn@naver.com");
		send(sms2, "02-1212-5555");
	}
	
	public static void send(MessageSender ms , String recipient) {
		ms.sendMessage(recipient);
		
	}
	
	
	
}
