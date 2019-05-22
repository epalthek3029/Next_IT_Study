//2019년 1월14일 월요일 마지막교시 과제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06StandardIO {

	public static void main(String[]args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		System.out.println("이름 : ");
			String name = reader.readLine();
			
		System.out.print("나이 : ");
			String str = reader.readLine();
			int age = Integer.parseInt(str);
			
		System.out.print("성별(M/F) : ");
			char gender = (char)reader.read();
			reader.readLine();
			
		System.out.print("몸무게 : ");
			float weight = Float.parseFloat(reader.readLine());
		
		System.out.print("신장 : ");
			double height = Double.parseDouble(reader.readLine());
		
		System.out.print("결혼여부 : ");
			boolean married = Boolean.parseBoolean(reader.readLine());
		
		System.out.print("전화번호 : ");
			String phone = reader.readLine();
		
		System.out.print("주소 : ");
			String address = reader.readLine();
		
		System.out.println("====================개인정보출력=======================");
		System.out.println("이름\t 나이\t 성별\t 몸무게\t 신장\t 결혼여부\t 전화번호\t 주소\t");
		System.out.printf("%s\t %d\t %c\t %.2f\t %.2f\t %b\t %s\t %s\n",
				name, age, gender, weight, height, married, phone, address);	
		
	}
}
