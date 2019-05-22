
public class Ex03NestedClass {

	int outField1 = 10;
	
	public void display(String msg) {
		System.out.println("===== display() 실행 =====");
		
		final int localVar = 50; // 지역변수
		// localVar = 30;
		
		// 지역 이너 클래스
		class LocalInner{
			int inField1 = 120;
			
			public void print() {
				System.out.println("===== LocalInner.print() 실행 =====");
				System.out.println("outField1 : " + outField1);
				System.out.println("inField1 : " + inField1);
				System.out.println("localVar : " + localVar);
				System.out.println("msg : " + msg);
			}
		}
		
		// 객체 생성.
		LocalInner inner = new LocalInner();
		inner.print();
	}
	
	
	public static void main(String[] args) {
		
		Ex03NestedClass outer = new Ex03NestedClass();
		outer.display("로컬 변수는 상수이거나 상수처럼 사용되어야 합니다.");
		}
}
