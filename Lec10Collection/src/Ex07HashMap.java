//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Ex07HashMap {
//	
//	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	// 세명의 개인정보 입출력하기 (이름, 나이, 성별, 전화번호)
//
//	ArrayList<HashMap<String, Object>> memberList = new ArrayList<HashMap<String, Object>>();
//
//	for(int i = 0; i < 3; i++)	{
//
//		HashMap<String, Object> member = new HashMap<String, Object>();
//
//		System.out.println("이름 : ");
//		member.put("name", reader.readLine());
//
//		System.out.println("나이 : ");
//		member.put("age", Integer.parseInt(reader.readLine()));
//
//		System.out.println("성별 : ");
//		member.put("gender", (char) reader.read());
//
//		System.out.println("전화 : ");
//		member.put("phone", reader.readLine());
//
//		memberList.add(member);
//	}
//
//	System.out.println("===== 회원목록 =====");
//	
//	for(int i = 0;i<memeberList.size();i++)	{
//		HashMap<String, Object> member = memberList.get(i);
//		
//		System.out.printf("%s\t %d\t %c\t %s\n" member.get("name"), member.get("age"), member.get("gender"), member.get("phone"));
//	}
//}
