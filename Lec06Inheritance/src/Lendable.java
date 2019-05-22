// 인터페이스
public interface Lendable {
	// 정적 상수 필드
	static final int STATE_NORMAL = 0;
	static final int STATE_BORROWED = 1;
	
	public abstract void checkIn();
	
	void checkOut(String borrower, String date);
	
}
