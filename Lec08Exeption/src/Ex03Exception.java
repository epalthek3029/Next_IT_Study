import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03Exception {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (NullPointerException e) {
			System.out.print("main : " + e.getMessage());
		}
		
		try {
			methodB();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			methodC();
		} catch (FileNotFoundException e) {
			// e.printStackTrace(); << 콘솔에 뜨는 빨간줄
			System.out.println("main : " + e.getMessage());
			
		}
	}

	public static void methodA() {
		System.out.println("===== methodA() 호출 ======");
		throw new NullPointerException("널 포인트 에러.");
	}

	public static void methodB() throws IOException{
		try {
		System.out.println("===== methodB() 호출 ======");
		throw new IOException("입출력 에러.");
		}catch(IOException e) {
			System.out.println("methodB : " + e.getMessage());
		}
	}

	public static void methodC() throws FileNotFoundException { // throws는 여러개 던질 수 있다
		System.out.println("===== methodC() 호출 ======");
		methodD();
	}

	public static void methodD() throws FileNotFoundException{ // throws 책임 전가
		System.out.println("===== methodD() 호출 ======");
		throw new FileNotFoundException("파일이 없습니다.");
	}
}
