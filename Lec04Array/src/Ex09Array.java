import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09Array {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 세명의 개인정보 입출력하기 (이름, 나이, 성별, 전화번호)
		
		int manCnt = 3;
		String[] name = new String[manCnt];
		int[] age = new int[manCnt];
		char[] gender = new char[manCnt];
		String[] phone = new String[manCnt];

		
		for(int i= 0; i < manCnt; i++) {
			System.out.print("이름 : ");
				name[i] = reader.readLine();
			
			System.out.print("나이 : ");	
				age[i] = Integer.parseInt(reader.readLine());
			
			System.out.print("성별 : ");	
				gender[i] = (char)reader.read();
				reader.readLine();
			
			System.out.print("전화번호 : ");	
				phone[i] = reader.readLine();
		}	
				
		
		System.out.println("==========개인정보 출력 란==============");
		System.out.println("이름\t 나이\t 성별\t 전화번호\n");
		
		for(int i = 0; i < manCnt; i++) {
			System.out.printf("%s\t %d\t %c\t %s\n", name[i], age[i], gender[i], phone[i]);
		}
		
		
		
		
		
		
	}
}
