//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//public class Ex06ArrayList {
//
//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	// 세명의 개인정보 입출력하기 (이름, 나이, 성별, 전화번호)
//
//	ArrayList<Member> memberList = new ArrayList<Member>();
//
//	for(int i = 0; i < 3; i++)	{
//
//		Member member = new Member();
//
//		System.out.println("이름 : ");
//		member.setName(reader.readLine());
//
//		System.out.println("나이 : ");
//		member.setAge(Integer.parseInt(reader.readLine()));
//
//		System.out.println("성별 : ");
//		member.setGender((char) reader.read());
//
//		System.out.println("전화 : ");
//		member.setPhone(reader.readLine());
//
//		memberList.add(member);
//	}
//
//	System.out.println("===== 회원목록 =====");
//
//	for(int i = 0;i<memeberList.size();i++)	{
//		Member member = memberList.get(i);
//		
//		System.out.printf("%s\t %d\t %c\t %s\n" member.getName(), member.getAge(), member.getGender(), member.getPhone());
//	}
//
//}
