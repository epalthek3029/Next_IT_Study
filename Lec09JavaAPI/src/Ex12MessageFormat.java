import java.text.MessageFormat;

public class Ex12MessageFormat {

	public static void main(String[] args) {
		
		String id = "san";
		String name = "이산";
		String phone = "010-1234-5678";
		
		String message = "회원ID : {0} 회원이름 : {1} 전화번호 : {2}";	//message
		
		String result = MessageFormat.format(message, id, name, phone);
		
		System.out.println(result);
		
		
	}
}
