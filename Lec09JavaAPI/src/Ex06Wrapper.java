
public class Ex06Wrapper {

	public static void main(String[] args) {
		
		Integer num1 = new Integer(50);	// 기본형 -> 객체, Boxing
		Integer num2 = new Integer("30");
		
		
		//int sum = num1 + num2;	// errer 떠야대는데 안뜨고 80이 나오네? (Java ver.1.5 이후로 가능)
		int sum = num1.intValue() + num2.intValue();	// correct, 객체 -> rlqhsgud, Unboxing
		System.out.println("sum = " + sum);
		
		disp(new Double(3.14));	// 이게 정석(옳음)
		disp(5.14);				// 원래는 errer(Java ver.1.5 이후로 가능)
	}
	
	public static void disp (Double d) {
		System.out.println(d);
	}
}
