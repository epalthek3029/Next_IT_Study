
public class InheritanceMain {

	public static void main(String[] args) {
		
		CheckingAccount check = new CheckingAccount("135-96-3235", "이산", 200000, "7896-9658-1234-5698");
		
		// 부모로 부터 상송 받은 메서드와 필드
		int money = check.withdraw(50000);
		System.out.println("인출금액 : " + money);
		System.out.println("잔    액 : " + check.balance);
		
		// 자신이 선언한 메서드 호출
		money = check.pay("7896-9658-1234-5698", 30000);
		System.out.println("지불금액 : " + money);
		System.out.println("잔    액 : " + check.balance);
		
		
	}
	
}
