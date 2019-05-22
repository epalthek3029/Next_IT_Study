import java.text.DecimalFormat;

public class Ex11DecimalFormat {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat decimalFormat = new DecimalFormat();
		System.out.println("default : " + decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("0.0");
		System.out.println("0.0 : " + decimalFormat.format(num));

		decimalFormat = new DecimalFormat("#,###.0");
		System.out.println("#,###.0 : " + decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("+#,###.0;-#,###.0");
		System.out.println("+#,###.0;-#,###.0: " + decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("\u00a4 #,###.0");
		System.out.println("\\u00a4 #,###.0 : " + decimalFormat.format(num));
	}
}
