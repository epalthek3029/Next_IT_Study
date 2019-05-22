//2019년 1월 10일 목요일
public class Ex02Casting {

	public static void main(String[] args) {
		
		// 강제 데이터 형 변환은 데이터손실이 있을 수 있으므로 감안하고 사용해야한다.
		
		byte byteNum = 10;
		int intNum = byteNum; // 자동 형 변환
		
		System.out.println("intNum" + intNum);
		
		short shortNum = 250;
		byteNum = (byte)shortNum; // 강제 형변화(Casting)
		
		System.out.println("byteNum : " + byteNum); // 데이터 손실이 발생할 수 있음.
		
		char ch = 'A';			  // A = 65
		shortNum = (short)ch ; // 똑같은 2byte 지만 값의 범위가 달라서 자동 형 변환이 안된다.
		
		System.out.println("shortNum : " + shortNum);
		
		float floatNum = 3.14F;
		long longNum = (long)floatNum; // float 는 부도 소수점 표현 방법, long 은 정수 타입
		
		System.out.println("long : " + longNum);
		
		System.out.println("안녕하세요.\n나의 이름은 \"이산\"입니다.");
		System.out.println("c:\\home\\abc\\xxxx.xx");
				

	}

}
