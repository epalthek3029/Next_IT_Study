
public class GcsTest001 {

	public static void main(String[] args) {
	
		// 1번, 2번
		String str = "stringTestData";
		System.out.println("1,2번 출력 : " + str);
		
		// 3번
		str = str.concat("kojo!");
		System.out.println("3번 출력 : " + str);
		
		// 4번
		str = str.substring(7, 15);
		System.out.println("4번 출력 : " + str);
		
		// 5번, 6번, 7번
		int strLength = str.length();
		System.out.println("5,6,7번 출력..변수 str의 길이 : " + strLength);
	
	}
}
