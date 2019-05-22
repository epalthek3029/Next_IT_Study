import kr.or.nextit.common.Account;

public class BonusPointAccount extends Account{

	int bonusPoint; // 보너스 포인트
	
	BonusPointAccount(String accountNo, String ownerName, int balance, int bonusPoint){
		
		super(accountNo, ownerName, balance);
		this.bonusPoint = bonusPoint;
	}
	
	// Comment, 주석 : 프로그램이나 로직 설명
	// @ > annotation : 시스템에게 알려주는 설명. 
	@Override
	protected void deposit(int amount) {
		balance += amount;
		bonusPoint += (amount * 0.001);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
