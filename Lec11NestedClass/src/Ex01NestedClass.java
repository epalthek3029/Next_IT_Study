
public class Ex01NestedClass {

	// 맴버 필드
	int outField1 = 10;
	
	// 맴버 메소드
	public void display() {
		System.out.println("========== display() 실행 ==========");
		Inner inner = new Inner();
		inner.print();
	}
	
	// 멤버 이너 클래스 (Member Inner Class)
	class Inner{
		
		int inField1 = 300;
		
		public void print() {
			System.out.println("========== Inner.print() 실행 ==========");
			System.out.println("outFiel1 : " + outField1);
			System.out.println("inFiel1 : " + inField1);
		}
	}
	
	public static void main(String[] args) {
		
		Ex01NestedClass outer = new Ex01NestedClass();
		//outer.display();
		
		// static 메소드 혹은 클래스 외부에서 이너 클래스 객체 생성.
		
		Ex01NestedClass.Inner inner =outer.new Inner();
		inner.print();
		
	}
	
	
	
	
	
	
}
