
public class Husband extends Thread{

	public Husband(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Ex03SynchMain.bank.deposit(50000);
		
		System.out.println(Thread.currentThread().getName() + " : deposit(50000) :" + Ex03SynchMain.bank.getBalance() );
	}
}
