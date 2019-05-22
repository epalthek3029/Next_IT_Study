//2019년 1월 14일 월요일

import java.io.IOException; //다른 폴더에 있는걸 가져오는 것
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Ex05StandardIO {

	public static void main(String[] args) throws IOException{
		/*
		// 한 바이트(문자) 읽기
		System.out.print("입력 :  ");
		
		int x = System.in.read(); // exception : 예외, 에러, IOExeption
		
		System.out.println("읽은 데이터 : " + (char)x);
		*/
		
		
		/*
		//하나의 숫자 읽기
		System.out.print("입력 : ");
		int x = System.in.read()-48; // 48 = '0'
		System.out.println("숫자 : " + x); 	// 숫자 7의 입력하면 컴퓨터는 문자 7을 인식해서 55를 출
												// 아스키 코드에서 48이 0이므로 숫자를 표현할려면 모든수에 48을 빼야
		*/
		
		//하나의 문자(char) 읽기
		//바이트 기반 : Stream
		//문자 기반	  : Reader, writer
		/*
		System.out.print("입력 : ");	
		int x = System.in.read();
		System.out.println("읽은 데이터 : " + (char)x);
		*/		
		/*
		System.out.print("입력 : ");	
		InputStreamReader isr = new InputStreamReader(System.in);
									//2차 스트림(보조스트림)  1차스트림
		int x = isr.read();
		System.out.println("읽은 데이터 : " + (char)x);
		*/
		
		// 문자열 읽기(하나의 라인)
		System.out.print("입력 : ");	
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(isr);
		
		String str = reader.readLine(); // 한 줄의 끝을 Enter(\n)로 읽어옴
		
		System.out.println("읽은 데이터 : " + str);
		
		System.out.print("숫자 : ");	
		str = reader.readLine(); // "150"
		int num = Integer.parseInt(str);
		System.out.println(num + " + 30 = " + (num + 30));
		
		System.out.print("숫자 : ");	
		str = reader.readLine(); // "3.14"
		float num2 = Float.parseFloat(str);
		System.out.println(num2 + " + 30 = " + (num2 + 30));
		
		
	}

}
