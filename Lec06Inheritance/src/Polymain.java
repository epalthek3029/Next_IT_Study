//import java.io.PrintStream;

public class Polymain {

	public static void main(String[] args) {
		
		Account acc = new Account("123-456-123", "혜윤", 50000);
		CheckingAccount check = new CheckingAccount("123-123-123", "지영", 200000, "156-156-7891" );
		CreditLineAccount minus = new CreditLineAccount("156-156-98765", "인직", 500000, 20000000);
		BonusPointAccount bonus = new BonusPointAccount("23123-231-321", "남순", 700000, 2000);
		
		disp(acc);
		
		disp(check);
		
		disp(minus);
		
		disp(bonus);
	}
	
	public static void disp(Account acc) {

		System.out.println("==========계좌정보 출력==========");
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예 금 주 : " + acc.ownerName);
		System.out.println("잔    액 : " + acc.balance);
		if (acc instanceof BonusPointAccount) {
			BonusPointAccount bonus = (BonusPointAccount) acc; // 다운캐스팅
			System.out.println("포 인 트 : " + bonus.bonusPoint);
		}
		System.out.println();
	}
/*	
	public static void disp(CheckingAccount acc) {
		
		System.out.println("==========계좌정보 출력==========");
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예 금 주 : " + acc.ownerName);
		System.out.println("잔    액 : " + acc.balance);
		System.out.println();
	}
	
	public static void disp(CreditLineAccount acc) {

		System.out.println("==========계좌정보 출력==========");
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예 금 주 : " + acc.ownerName);
		System.out.println("잔    액 : " + acc.balance);
		System.out.println();
	}
	
	public static void disp(BonusPointAccount acc) {

		System.out.println("==========계좌정보 출력==========");
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예 금 주 : " + acc.ownerName);
		System.out.println("잔    액 : " + acc.balance);
		System.out.println();
	}
*/
	// 메소드 오버로딩(이름만 같고 하는 일은 다른 것)
}

