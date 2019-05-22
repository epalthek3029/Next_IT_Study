import java.util.StringTokenizer;

public class Ex06StringTokenizer {

	public static void main(String[] args) {
		
		//String str = "이재학 연초희 김다슬 도민석 이 산";
		//String str = "이재학,연초희,김다슬,도민석,이 산";	// CSV 컴마 세퍼레이트 뷀류 ㅋㅋㅋㅋㅋ(컴마를 기준으로)
		//String str = "이재학,연초희|김다슬@도민석,이 산";
		String str = "12+3*5";
		
		//StringTokenizer stok = new StringTokenizer(str);
		//StringTokenizer stok = new StringTokenizer(str, ",");
		//StringTokenizer stok = new StringTokenizer(str, ",|@");
		StringTokenizer stok = new StringTokenizer(str, ",|@", true);
		
		while(stok.hasMoreTokens()) {
			String name = stok.nextToken();
			System.out.println(name);
		};
	}
}
