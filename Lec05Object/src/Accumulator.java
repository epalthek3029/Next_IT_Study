
public class Accumulator {
	
	// 맴버 필드
	int total;		// 인스턴스 필드
	//int grandTotal;	// 인스턴스 필드
	static int grandTotal; // 클래스 필드, static field(정적 필드)
	// 생성자
	Accumulator(){}

	// 멤버 메서드, 인스턴스 메서드
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	// 인스턴스 필드를 구분하는 이유는 클레스 필드와 판별하기 위해서 이다.
	
	static int getGrandTotal() {
		// total = total + 10; // 인스턴스 필드 사용 불가..
		return grandTotal;
	}
	
	
	
}
