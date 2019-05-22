// 상송받겠다 CDInfo를..
// implements 구현한다.
public class AppCDInfo extends CDInfo implements Lendable {

	String borrower; // 대출인
	String date; // 대출일
	int state; // 상태 (0 : 대출가능, 1 : 대출불가)

	AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	@Override
	public void checkIn() {
		borrower = null;
		date = null;
		state = STATE_NORMAL;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		
		if(this.state == STATE_NORMAL) {
		this.borrower = borrower;
		this.date = date;
		this.state = STATE_BORROWED;
		System.out.println(">>>>>>>>>>>>부록CD대출<<<<<<<<<<<<<");
		System.out.println("# " + title + " 부록 CD 가 대출되었습니다.");
		System.out.println();
		}else {
			System.out.println("# " + title + " 부록 CD 가 대출 불가합니다.");
		}
	}
}
