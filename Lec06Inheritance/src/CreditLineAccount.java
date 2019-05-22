
public class CreditLineAccount extends Account{

	int creditLine;	// 마이너스 한도
	
	CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine){
		
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// Override
	int withdraw(int amount) {
		
		if((balance + creditLine) < amount ) {
			System.out.println("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
}
