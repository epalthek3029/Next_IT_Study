//2019년 1월 9일 수요일
public class Ex01Person {
	
	public static void main(String[] arg) {
		
		// 개인정보 : 이름, 나이, 성별, 몸무게, 신장, 결혼여부, 전화번호, 주소
		
		String name ="홍길동";
		String phone = "010-1111-3333";
		String address = "개미집 지하 5층 왼쪽 방";
		
		int age;
		
		age = 25;
		
		float weight = 55.5F;
		
		double height = 185.5;
		
		char gender = 'M';
		
		boolean married = true;
		
		System.out.println("--------개인정보 출력 란---------");
		System.out.println("이름 : " + name + '\n' + "나이 : " + age + '\n'+ "성별 : " + gender );
		System.out.println("몸무게 : " + weight + "KG" + '\n' + "신장 : " + height + "CM");
		System.out.println("결혼여부 :" + true);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address + '\n' + "--------------------------------");
	}

}
