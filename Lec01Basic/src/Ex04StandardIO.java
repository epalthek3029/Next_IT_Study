//2019년 1월 14일 월요일
public class Ex04StandardIO {

	public static void main(String [] args) {
		
		/*
		 * Srting > 시냇물 길
		 * 입력은 inputString 이고 여기서 System.in 사용
		 * 출력은 outputString이고 여기서 System.out사용
		 * */
		/*
		System.out.println("Java 표준입출력"); //첫 글자가 대문자이면 class이다
						//ln은 다음칸으로 엔터한다.
		System.out.print("안녕하세요."); //ln이 없으면 엔터 없
		System.out.println("표준 출력예제.");
		*/
		
		/*
		 	%d 정수를 10진법으로 표시
			%o 정수를 8진법으로 표시
			%x, %X 정수를 16진법으로 표시  0~9, A , B , C , D , E , F, 0x40ff
			%f 부동소수점를 10진법으로 표시
			%e, %E 부동소수점를 10진법으로 표시, 가수와 지수로 표현
			%g, %G 부동소수점를 10진법으로 표시
			%a, %A 부동소수점를 16진법으로 표시 , 가수와 지수로 표현
			%s, %S 문자열 표시
			%c, %C 유니코드 문자
			%h, %H 해쉬 코드 표시
			%b, %B 불리언 값 표시
		 */
		/*
		System.out.printf("10진수 : %d\n", 120);
		System.out.printf("10진수 : %5d\n", 120); //오른쪽 정렬 
		System.out.printf("10진수 : %-5d\n", 120);//왼쪽 정렬
		
		System.out.printf("8진수 : %o\n", 120);
		System.out.printf("16진수 : %X\n", 78755);
		
		System.out.printf("실수 : %f\n", 3.145656);
		System.out.printf("실수 : %5.2f\n", 3.145656); //소수정 위로 5자리, 아래로 2자리 표현
		System.out.printf("실수 : %.2f\n", 3.145656);	//소수점만 설정
		
		System.out.printf("문자열 : %s\n", "String");
		System.out.printf("문자열 : %c\n", 'A');
		System.out.printf("문자열 : %b\n", (10 < 20));
		*/
		
		String name = "설현";
		int age = 25;
		char gender = 'F';
		float weight = 45.56F;
		double height = 168.23;
		boolean married = false;
		String phone = "010-1234-5678";
		String address = "대전시 중구 오류동";
		
		System.out.println("==========회원 목록==========");
		System.out.println("이름\t 나이\t 성별\t 몸무게\t 신장\t 결혼여부\t 전화번\t 주소");
		System.out.printf("%s\t %d\t %c\t %.2f\t %.2f\t %b\t %s\t %s\n", name, age, gender, weight, height, married, phone, address);
		System.out.printf("%s\t %d\t %c\t %.2f\t %.2f\t %b\t %s\t %s\n", name, age, gender, weight, height, married, phone, address);
		System.out.printf("%s\t %d\t %c\t %.2f\t %.2f\t %b\t %s\t %s\n", name, age, gender, weight, height, married, phone, address);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
