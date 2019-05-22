
public class AccountMain {

	public static void main(String[] args) {
		
		Account acc1 = new Account("123-45-456-1234", "이설", 200000);
		Account acc2 = new Account("321-45-456-1234", "설현", 50000);
		
		int amount = acc1.withdraw(100000);
		
		acc2.deposit(amount);
		
		System.out.println("예금주 : " + acc1.ownerName);
		System.out.println("잔  액 : " + acc1.balance);
		
		System.out.println("예금주 : " + acc2.ownerName);
		System.out.println("잔  액 : " + acc2.balance);
		
		
		
		
		
	}
}
