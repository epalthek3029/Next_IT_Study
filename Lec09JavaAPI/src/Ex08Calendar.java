import java.util.Calendar;

public class Ex08Calendar {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// System.out.println("Class Name : " + cal.getClass().getName());
		// System.out.println(cal);
		
		// cal.set (Calendar.YEAR, 2200);
		// cal.set(1987, 3, 15);
		// cal.add(Calendar.DATE, 100);
		// cal.add(Calendar.DATE, -14);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int date = cal.get(Calendar.DATE);
		int amPm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초"
							, year, month, date
							, (amPm == Calendar.AM?"오전":"오후"), hour, min, sec);
	}
}
