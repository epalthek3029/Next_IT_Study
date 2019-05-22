
public class SeperateVolume implements Lendable {

	String requestNo; // 청구번호
	String bookTitle; // 책 제목
	String writer; // 저자

	String borrower; // 대출인
	String date; // 대출일
	int state; // 상태 (0 : 대출가능, 1 : 대출불가)
	
	SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkIn() {
		borrower = null;
		date = null;
		state = STATE_NORMAL;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (this.state == STATE_NORMAL) {
			this.borrower = borrower;
			this.date = date;
			this.state = STATE_BORROWED;
			System.out.println(">>>>>>>>>>>>단행본대출<<<<<<<<<<<<<");
			System.out.println("# " + bookTitle + " 단행본이(가) 대출되었습니다.");
			System.out.println();
		} else {
			System.out.println("# " + bookTitle + " 단행본이(가) 대출 불가합니다.");
		}

	}

}
