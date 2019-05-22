import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		
		// 2019년 1월 24일 오후 3시 6분 4초
		// String pattern = "yyyy년 MM월 dd일 a hh시 mm분 ss초";
		// String pattern = "yyyy-MM-dd HH:mm:ss";
		String pattern = "yyyy/MM/dd E요일";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		
		Date date = new Date(); // 현재시간
		String result = dateFormat.format(date);
		
		System.out.println(result);
		
		String birthDay = "1987-01-20";
		
		dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		dateFormat.parse(birthDay);
		
		date = dateFormat.parse(birthDay);
		
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.add(Calendar.MONTH, 3);
		
		System.out.println("3개월 후 : " + dateFormat.format(cal.getTime()));
		
	}
}
