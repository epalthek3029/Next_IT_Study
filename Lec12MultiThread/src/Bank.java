
public class Bank {
	
	private int balance = 200000; // 잔액

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	// synchronized 메서드
	public synchronized void deposit(int amount) {
		int money = getBalance();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		setBalance(money + amount);
	}

	public int withdraw(int amount) {
		
		// synchronized 블럭
		synchronized (this) {
			int money = getBalance();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

			setBalance(money - amount);
			return amount;
		}
	}
}
