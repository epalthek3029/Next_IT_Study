import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam03 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 사용자가 입력한 값을 읽어 올 수 있도록..
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 배열 선언...
		Person[] memberList = new Person[3];

		// for문을 이용해서 각 정보를 배열의 길이만큼 받아들기(반복)
		for (int i = 0; i < memberList.length; i++) {

			memberList[i] = new Person();

			System.out.print("이    름 : ");
			memberList[i].setName(reader.readLine());

			System.out.print("나    이 : ");
			memberList[i].setAge(Integer.parseInt(reader.readLine()));

			System.out.print("성    별 : ");
			memberList[i].setGender((char) reader.read());
			reader.readLine();

			System.out.print("전화번호 : ");
			memberList[i].setPhone(reader.readLine());
		}

		// 출력란
		System.out.println("=========== 개인정보 출력 ===========");
		System.out.print("이름\t 나이\t 성별\t 전화번호\n");

		// for문을 통해 입력 받은 값 출력
		for (int i = 0; i < memberList.length; i++) {
			Person member = memberList[i];
			System.out.printf("%s\t %d\t %c\t %s\n", member.getName(), member.getAge(), member.getGender(),
					member.getPhone());
		}
		System.out.println("=========== 프로그램 종료 ===========");
	}
}
