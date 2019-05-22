//2019년 1월 11일 금요일
public class Ex03Operator {
	
	public static void main(String [] args) {
		
		// 증감연산자 ( ++, -- )
		
		int x = 10;
		// int y = x++; // y = x; x를 먼저 할당 하고 x = x + 1 나중에 1을 증가 시킨다.
		int y = x--;	 // x = x + 1 먼저 1을 증가시키고 y = x; 에 할당
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// 산술연산자 ( + , - , * , / , % )
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);// int 형보다 작은 데이터 타입의 연산시 int 형으로 변환되서 수행.
		System.out.println("byte c : " + c);
		
		x = 10;
		long d = 20;
		x = (int)(x + d);// x = (x + d); 은 작은 값 int (x) 가 큰 값 long (d) 형으로 자동 형 변환이 생겨 계산이 수행 된다.
		
		x = 197;
		System.out.println("x % 3 = " + ( x % 3 )); // 나머지 0~2
		System.out.println("x % 3 = " + ( x % 12 ));// 나머지 0~11
		
		// 쉬프트 연산자 ( >> , << , >>> )
		x = -120;
		System.out.println("x >> 2= " + (x >> 2)); // -120 / 4 = -30 (2^2만큼 나눔)
		System.out.println("x >> 2= " + (x << 2)); // -120 * 4 = -480(2^2만큼 곱함)
		System.out.println("x >>> 2= " + (x >>> 2));// 비트를 밀기때문에 곱샘이나 나눗샘의 의미가 아니다.
		System.out.println("------------------------------------------");
		
		// 비교연산자 ( < , > , <= , >= , == , != )	
		x = 10;
		y = 20;
		System.out.println("X < Y = " + ( x < y ));
		System.out.println("X > Y = " + ( x > y ));
		System.out.println("X <= Y = " + ( x <= y ));
		System.out.println("X >= Y = " + ( x >= y ));
		System.out.println("X == Y = " + ( x == y ));
		System.out.println("X != Y = " + ( x != y ));
		System.out.println("------------------------------------------");
		
		// 논리연산자 ( && , || , ! , & , | )
		/* T && T = T
		 * T && F = F
		 * F && T = F
		 * F && F = F
		 * ------------
		 * T || T = T
		 * T || F = T
		 * F || T = T
		 * F || F = F
		 */
		System.out.println("x = 10, y = 20");
		System.out.println("(x < y) && (x > y) = " + ((x < y) && (x > y)) ); // 앞이 F 이면 뒤에는 연산 할 필요 없어서 안한다.
		System.out.println("(x < y) || (x > y) = " + ((x < y) || (x > y)) ); // 앞이 T 이면 뒤에는 연산 할 필요 없어서 안한다.
		System.out.println("!(x < y) = " + !(x < y));
		System.out.println("------------------------------------------");
		
		// 대입연산자 ( = , += , -= , *= , /= , %= )
		x += 1; // x = x + 1;
		
		x = 12;
		byte num = 20;
		num += x; // 복합 연산자의 경우 자동으로 형변환계산이 자연스럽다.
		//num =(byte)(num+x); 풀어서 사용하면 강제형변환을 시켜줘야한다.
		System.out.println("num = " + num);
		
		x = 4;
		num %= x;
		System.out.println("num = " + num);
		
		// 비트연산자( & , | , ^ , ~)
		x = 170; // 10101010 , 15 -> 00001111
		System.out.println("x & 15 = " + (x & 15)); // mask연산.
		System.out.println("x | 15 = " + (x | 15)); // 특정비트 1로 셋팅.
		System.out.println("x ^ 15 = " + (x ^ 15)); // 특정비트 반전.
		System.out.println("~x = " + (~x));			// 1의 보수
		System.out.println("------------------------------------------");
		
		//상항연산자( 조건식 ? 참 : 거짓 )
		char gender = 'M'; // M, F
		
		String result = (gender == 'M') ? "남성" : "여성";
		System.out.println("당신의 성별은 " + result);
		
		//연습문제 > 양수, 음수, 0 판별하
		//내가 푼 방식
		int no = 7;
		String Number7 = ( no > 0 ) ? ( no == 0 ) ? "0" : "양수" : "음수";
		System.out.println("숫자 7 은 " + Number7 );
		//샘이 푼 방식
		int noo = -4;
		result = (noo > 0) ? "양수" : (noo == 0 ? "0" : "음수");
		System.out.println("숫자 -4 은 " + result);

		}

}