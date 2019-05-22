public class Ex08FroStmt {
	
	public static void main(String[] args) {
		
		// 10 진수를 2진수, 8진수, 16진수 변환하기
		
		int num = -100;
		
		// 2진수 : 00000000 00000000 00000000 01111000
		// 8진수 : 00000000170
		// 16진수: 00000078

		// 2진수로 변환
		String result = "";
		int temp = num;
		
		for( int i = 0; i < 32 ; i++) {
				 result = ( temp & 1 ) + result;
				 temp = temp >>> 1;
		}
		System.out.println("2진수 : " + result);
		
		// 8진수로 변환, 0 ~ 7, 3bit, 000 ~ 111
		result = "";
		temp = num;
		
		for( int i = 0; i < 11 ; i++) {
			 	result = ( temp & 7  ) + result;
			 	temp = temp >>> 3;
		}
		System.out.println("8진수 : " + result);
		
		// 16진수로 변환, 0 ~ 9. A. B. C .... , 4bit, 0000 ~ 1111
		result = "";
		temp = num;
		
		for( int i = 0; i < 8 ; i++) {	
			switch(temp & 15){
				case 10 : result = "A" + result; break;
				case 11 : result = "B" + result; break;
				case 12 : result = "C" + result; break;
				case 13 : result = "D" + result; break;
				case 14 : result = "E" + result; break;
				case 15 : result = "F" + result; break;
				default : result = (temp%16) +result;
			}				
				result = ( temp & 15 ) + result;
				temp = temp >>> 4;
		}
		System.out.println("16진수 : " + result);
		
		
	}

}
