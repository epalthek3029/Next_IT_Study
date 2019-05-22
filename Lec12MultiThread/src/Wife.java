
public class Wife extends Thread {

	Wife(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		
		Ex03SynchMain.bank.withdraw(30000);
		
		System.out.println(Thread.currentThread().getName() + " : withdraw(30000) : " + Ex03SynchMain.bank.getBalance());

	}
}
