// extends 확장하다.
public class CheckingAccount extends Account{

	String cardNo;	// 카드 번호
	
	CheckingAccount(String accountNo, String ownerName, int balance, String cardNo){
		// super(); // 상위클래스의 생성자.
		
		super(accountNo, ownerName, balance); // this 생성자 처럼 맨 위에 올라와있어야 한다.
//		super.accountNo = accountNo; // this로 해도 좋지만 super로 하면 아! 이녀석은 상속받았구나 이렇게 알 수 있다,
//		super.ownerName = ownerName;
//		super.balance   = balacnet;
//		super.cardNo    = cardNol
		
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) {
		
		// 객체의 비교시 !=, == 등의 비교연산자 사용 x 
		if(!this.cardNo.equals(cardNo)|| balance < amount) {
			System.out.println("지불 불가 합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}
	
}
