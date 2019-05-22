import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex09Calendar {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
        
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		
		Calendar cal = Calendar.getInstance();	// 현재시간
		cal.set(year, month - 1, 1);
		
		// 해당 월의 1일의 요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;	// 1 ~ 7
		
		System.out.print("해당 요일 : " + dayOfWeek);
		System.out.println();
		
		// 달력출력
		System.out.printf("         %d년 %02d월\n", year, month);
		System.out.print("일\t 월\t 화\t 수\t 목\t 금\t 토");
		System.out.println("");
		
		// 요일공백
		for(int i = 0; i < dayOfWeek; i++) {
			System.out.print(" \t");
		}
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
				
		// 날짜출력
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
