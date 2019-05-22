
public class Account {

	String accountNo;	// 계좌번호
	String ownerName;	// 예금
	int balance;			// 잔액(예제니깐 int로 한거임 범위가 21억밖에 안됨)
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 입금하다.
	void deposit(int amount) {
		balance += amount;
	}
		
	// 출금하다.
	int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}	
}
