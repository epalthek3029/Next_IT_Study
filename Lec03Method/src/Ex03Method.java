
public class Ex03Method {
	
	public static void main(String[] args) {
		
		// 10 진수를 2진수, 8진수, 16진수 변환하기
		
		int num = 120;
		System.out.println("2진수 : " + getconvert(num, 1, 1));
		System.out.println("8진수 : " + getconvert(num, 7, 3));
		System.out.println("16진수 : " + getconvert(num, 15, 4));
		
		System.out.println("2진수 : " + getconvertt(num, 1));
		System.out.println("8진수 : " + getconvertt(num, 3));
		System.out.println("16진수 : " + getconvertt(num, 4));
		
		System.out.println("2진수 : " + toBinaryString(num));
		System.out.println("8진수 : " + toOctalString(num));
		System.out.println("16진수 : " + tohexString(num));
				
	}
	
	public static String toBinaryString(int num) {
		
		return getconvertt(num, 1);
	}
	public static String toOctalString(int num) {
		
		return getconvertt(num, 3);
	}
	public static String tohexString(int num) {
	
		return getconvertt(num, 4);
	}
	
	public static String getconvertt(int num, int shift) {
		
		String result = "";
		int mask = (1 << shift) - 1 ; // 1 * 2^3
		do {
		switch(num & mask){
			case 10 : result = "A" + result; break;
			case 11 : result = "B" + result; break;
			case 12 : result = "C" + result; break;
			case 13 : result = "D" + result; break;
			case 14 : result = "E" + result; break;
			case 15 : result = "F" + result; break;
			default : result = (num%16) +result;
		}	
		num = num >>> shift;
		}while(num > 0);
	
		return result;
	}
	

	public static String getconvert(int num, int mask, int shift) {
		
		String result = "";
		do {
		switch(num & mask){
			case 10 : result = "A" + result; break;
			case 11 : result = "B" + result; break;
			case 12 : result = "C" + result; break;
			case 13 : result = "D" + result; break;
			case 14 : result = "E" + result; break;
			case 15 : result = "F" + result; break;
			default : result = (num%16) +result;
		}	
		num = num >>> shift;
		}while(num > 0);
	
		return result;
	}

}
