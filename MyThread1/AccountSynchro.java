package MyThread1;

public class AccountSynchro implements Runnable {
	private Account acct = new Account();

	public static void main(String[] args) {
		AccountSynchro acctDanger = new AccountSynchro();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.setName("Sakshi");
		t2.setName("Varsha");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			makeWithdrawal(1000);
		}
	}

	private synchronized void makeWithdrawal(int amount) {
		if (acct.getBalence() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acct.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " complete withdraw Blalence: " + acct.getBalence());
		} else {
			System.out.println("Not enough balence in account for " + Thread.currentThread().getName()+"Balence :"+acct.getBalence());
		}

	}
}
