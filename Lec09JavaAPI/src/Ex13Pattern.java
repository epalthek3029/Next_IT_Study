import java.util.regex.Pattern;

public class Ex13Pattern {

	public static void main(String[] args) {
		
		// 유효성 검증. Javascript, Java, DB
		String phone = "010-1234-5678";	// 02-123-4567, 042-1234-5678
		
		String regex = "0\\d{1,2}-\\d{3,4}-\\d{4}";
		
		if(Pattern.matches(regex, phone)) {
			System.out.println("적합한 전화번호입니다.");
		} else {
			System.out.println("부적합한 전화번호입니다.");
		}
		
		String email = "alnske21@naver.com";	// welnrk23@11st.co.kr, wn2wn2wn@gmail.com
		
		regex = "\\w+@\\w+[.]\\w+([.]\\w+)?";
		
		if(Pattern.matches(regex, email)){
			System.out.println("적합한 이메일입니다.");
		} else {
			System.out.println("부적합한 이메일입니다.");
		}

		
		
		
		
	}
}
