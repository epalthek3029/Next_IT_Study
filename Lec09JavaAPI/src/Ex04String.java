
public class Ex04String {

	public static void main(String[] args) {
		
		String str = new String("Java String 예제"); // 문자열 리터럴 상수
		
		int len = str.length(); // 길이
		
		for(int i = 0; i < len; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str1 = "자바는 껌이다?";		// reference 문자열 리터럴 상수
		String str2 = new String("자바는 껌이다?");		// 0x1500 
															// 0x1200
		
		if(str1.equals(str2)) {
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		String str3 = "Java Programming is";
		
		System.out.println("substring() : " + str3.substring(5));
		System.out.println("substring() : " + str3.substring(5, 17));
		System.out.println("substring() : " + str3.substring(5, str3.indexOf(" is")));
		System.out.println("toUpperCase() : " + str3.toUpperCase());
		System.out.println("toLowerCase() : " + str3.toLowerCase());
		
		String fileName = "/home/ssam/abc.png";
		
		System.out.println(fileName.substring(fileName.lastIndexOf("/")));
		
		if(fileName.endsWith(".png")) {
			System.out.println("이지미 파일입니다.");
		}
		
		System.out.printf("%s, %d, %.2f\n", "이산", 25, 53.24);
		String str4 = String.format("%s, %d, %.2f\n", "설현", 25, 53.24);
		System.out.println("개인정보 : " + str4);
		
		// 1, 2, 3, 4, ... , 12, 250, 4500, 12500
		String codeVal = String.format("A%05d", 13); // "A00001", "A00012", "A00250", "A04500"
		System.out.println("PK" + codeVal);
		
		String email = "san1004@naver.com"; // 010-1234-5678
		System.out.println();
		
		String[] data = email.split("@");
		System.out.println("ID : " + data[0]);
		System.out.println("Domain : " + data[1]);
		
		String phone = "010-1234-5678";
		System.out.println();
		String[] data1 = phone.split("-");
		System.out.println("ID : " + data1[0]);
		System.out.println("Domain : " + data1[1]);
		
		
		
		
	}
}
