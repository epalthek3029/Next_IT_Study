
public class Ex01Object {

	public static void main(String[] args) {
		
		Member m1 = new Member("Ang", "휴젝맨", 55, "010-1234-4567");	// 0x1200
		Member m2 = new Member("Ang", "휴젝맨", 55, "010-1234-4567");	// 0x3500
		
		if(m1 == m2) {
			System.out.println("동일 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		// Object.equals() 메서드는 동등비교연산자(==) 같다.
		if(m1.equals(m2)) {
			System.out.println("동일 객체2");
		}else {
			System.out.println("다른 객체2");
		}
		
		System.out.println("m1 : " + m1);
		System.out.println("m2 : " + m2.toString()); // Member@6d06d69c
		
		System.out.println("m1.hashCod() : " + m1.hashCode());
		
		
		
	}
}
