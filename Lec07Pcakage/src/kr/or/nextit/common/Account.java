package kr.or.nextit.common;

public class Account {

	protected String accountNo;	// 계좌번호
	protected String ownerName;	// 예금
	protected int balance;			// 잔액(예제니깐 int로 한거임 범위가 21억밖에 안됨)
	
	public Account() {}
	
	protected Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 입금하다.
	protected void deposit(int amount) {
		balance += amount;
	}
		
	// 출금하다.
	protected int withdraw(int amount) {
		if(balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= amount;
		return amount;
	}	
}
