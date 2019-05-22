import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.activation.registries.MailcapParseException;
import com.sun.org.apache.xerces.internal.impl.io.MalformedByteSequenceException;

public class Ex02Exception {

	public static void main(String[] args) {
		
		try {
			System.out.print("입 력 : ");
			int x = System.in.read() - 48; // 0
			
			switch(x){
			case 1 : throw new NullPointerException();
			case 2 : String str = null; str.length();
			case 3 : throw new ArithmeticException("산술에러");
			case 4 : throw new ClassNotFoundException("해당 클레스를 찾을 수 없습니다.");
			case 5 : throw new FileNotFoundException("해당 파일을 찾을 수 없습니다.");
			
			case 6 : throw new MailcapParseException("잘못된 URL에러");
			case 7 : throw new ClassCastException("클래스 캐스팅 에러");
			
			case 8 : throw new BizException("계좌이체시 에러 발생.");
			}
		}	
		catch(FileNotFoundException e) {
			 System.out.println(e.getMessage());	
			 
		}catch(IOException e) {
			System.out.println("입출력 에러 발생.");
			
		}catch(NullPointerException e) {
			System.out.println("널 포인트 에러.");
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println("Exception >" + e.getMessage());
		}
		
		System.out.println("====== 프로그램 정상 종료 ======");
		 //catch(FileNotFoundException e) {				FileNotFoundException이
		 //	 System.out.println(e.getMessage());			IOException의 자식이여서 위에서 잡힘
		 //}												업 케스팅
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
