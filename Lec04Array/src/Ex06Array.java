import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06Array {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 태양력, 서기
		// 1년 1월 1일 월요일
		// 2년 1월 1일 화요일
		// 3년 1월 1일 수요일
		// 4년 1월 1일 목요일
		
//		1. 작년까지 평년의 횟수 구하기(2018)
//		2. 작년까지 윤년의 횟수 구하기(946)
//		3. 올해의 해당 월까지의 1일까지 지난 날짜의 합(31 + 28(29) + 1)
//		4. ( 2018 + 946 + 60 ) % = ? (해당 요일) 
		
		// 2019년 1월
        
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
        
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
        
		int[] maxDate = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		
		// 작년까지의 평년의 횟수		
		int lastYear = year - 1;
		
		// 작년까지의 윤년의 횟
		int leapYearCnt = (lastYear / 4) - (lastYear / 100) + (lastYear / 400);
		
		// 올해가 윤년인 판별
		boolean isLeapYear = false; // 평년
		
		if(year%4 == 0 && year%100 != 0|| year%400 == 0) {
			maxDate[1] = 29; // 윤년
		}
		
		
		// 올해 해당 월의 1일까지의 누적합
		int dayOfYear = 1;
		
		for(int i = 0; i < month - 1; i++) {
			dayOfYear += maxDate[i];			
		}
		
		// 해당 월의 1일의 요일
		int dayOfWeek = (lastYear + leapYearCnt + dayOfYear) % 7;
		
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
		
		int lastDay = maxDate[month - 1]; // 해당 월의 마지막 날
		
		// 날짜출력
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
