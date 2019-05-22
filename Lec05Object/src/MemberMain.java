import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MemberMain {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// 세명의 개인정보 입출력하기 (이름, 나이, 성별, 전화번호)
		
		Member[] memberList = new Member[3]; // 세명
		
		for(int i= 0; i < memberList.length; i++) {
			
			memberList[i] = new Member();
			
			System.out.print("이름 : ");
				memberList[i].setName(reader.readLine());
			
			System.out.print("나이 : ");	
				memberList[i].setAge(Integer.parseInt(reader.readLine()));
				
			System.out.print("성별 : ");	
				memberList[i].setGender((char)reader.read());
				reader.readLine();
			
			System.out.print("전화번호 : ");	
				memberList[i].setPhone(reader.readLine());
		}	
				
		
		System.out.println("==========개인정보 출력 란==============");
		System.out.println("이름\t 나이\t 성별\t 전화번호\n");
		
		for(int i = 0; i < memberList.length; i++) {
			Member member = memberList[i];
			System.out.printf("%s\t %d\t %c\t %s\n", member.getName(), member.getAge(), member.getGender(), member.getPhone());
		}	
	}
}
