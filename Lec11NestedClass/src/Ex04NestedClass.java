
interface ISample{
	public void methodC();
}

class Sample{
	
	public void methodA() {
		System.out.println("===== methodA() 실행 =====");
	}
	
	public void methodB() {
		System.out.println("===== methodB() 실행 =====");
	}
}

public class Ex04NestedClass {

	public void handle(ISample s) {
		System.out.println("===== handle() 실행 =====");
		s.methodC();
	}
	
	public void diplay() {
		System.out.println("===== display() 실행 =====");
		
		System.out.println(">>>>> 일반적인 객체 사용<<<<<");
		
		Sample s1 = new Sample();
		s1.methodA();
		s1.methodB();
		
		System.out.println(">>>>> 익명 중첨 클래스 사용 #1 <<<<<");
		
		Sample s2= new Sample(){
			//오버라이딩
			public void methodA() {
				System.out.println(">>>>> 재정의된 methodA <<<<<<");
			}
		};
		s2.methodA();
		s2.methodB();
		
		System.out.println(">>>>> 익명 중첨 클래스 사용 #2 <<<<<");
		new Sample() {
			@Override
			public void methodB() {
				System.out.println("===== 새롭게 정의한 methodB() =====");
			}
		}.methodB();
		
		System.out.println(">>>>> 익명 중첨 클래스 사용 #3 <<<<<");
		
		ISample s3 = new ISample() {
			@Override
			public void methodC() {
				System.out.println("===== 재정의된 methodC() =====");
			}
		};
		s3.methodC();
		
		System.out.println(">>>>> 익명 중첨 클래스 사용 #4 <<<<<");
		handle(new ISample() {
			@Override
			public void methodC() {
				System.out.println("===== 새롭게 정의한 methodC() =====");
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		Ex04NestedClass outer = new Ex04NestedClass();
		outer.diplay();
	}
}
