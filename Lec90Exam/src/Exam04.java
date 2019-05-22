import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Exam04 {

	public static void main(String[] args) throws IOException{
		
		// 사용자가 입력한 값을 읽어 올 수 있도록.. 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		// 입력란
		System.out.println("찾으시는 년도와 월을 입력해 주세요.\n");
		System.out.print("년 입력 : ");
		int year = Integer.parseInt(reader.readLine());
        
		System.out.print("월 입력 : ");
		int month = Integer.parseInt(reader.readLine());
		
		// Calendar클래스
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;	
		
		// 받은 값 출력해주기
		System.out.print("\t\t    " + year + "년 " + month + "월\n");
		System.out.print("일\t 월\t 화\t 수\t 목\t 금\t 토");
		System.out.println("");
		
		for(int i = 0; i < dayOfWeek; i++) {
			System.out.print(" \t");
		}
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
				
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + " \t");
			if((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
