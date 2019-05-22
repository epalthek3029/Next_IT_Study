
public class OverrideMain {

	public static void main(String[] args) {

		CreditLineAccount minus = new CreditLineAccount("123-456-789", "은주", 10000, 2000000);

		int money = minus.withdraw(800000); // 자식 클래스의 Overriding 메서드 호출.
		System.out.println("인출금액 : " + money);
		System.out.println("잔    액 : " + minus.balance);

		BonusPointAccount bonus = new BonusPointAccount("321-654-987", "설현", 200000, 1000);

		bonus.deposit(2000000);
		System.out.println("잔    액 : " + bonus.balance);
		System.out.println("보 너 스 : " + bonus.bonusPoint);
		
		System.out.println("아아");
	}
}

// ctrl + d > 한줄 삭제하기
// alt + 방향키 위 아래 > 줄 옮기기
// ctrl + shift + f > 들여쓰기
// ctrl + alt + 방향키 > 복사