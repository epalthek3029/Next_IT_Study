
public class Ex02NestedClass {

	int outField1 = 10;
	static int outField2 = 20;
	
	static class StaticInner{
		int inField1 = 100;
		static int inField2 = 200;
		
		public void print() {
			System.out.println("==== StaticInner.print() 실행 ====");
//			System.out.println("outField1 : " + outField1);	// non-static 필드 사용 x
			System.out.println("outField1 : " + outField2);	
			System.out.println("inField : " +inField1);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Ex02NestedClass.StaticInner inner = new Ex02NestedClass.StaticInner();
		inner.print();
	}
}
