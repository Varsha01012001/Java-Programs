package MyThread1;

//public class InterThread {
	
	class Customer{
		private int balence =10000;
		
		synchronized void withdraw(int amount) {
			System.out.println("going to withdraw Rs."+amount);
			if(balence<amount) {
				System.out.println("less Balence. waiting for deposit.......");
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			balence -=amount;
			System.out.println("Withdraw complited.Balence:Rs."+balence);
			}
		synchronized void deposit(int amount) {
			System.out.println("Going to deposit Rs."+amount);
			balence +=amount;
			System.out.println("deposit complite. Balence : Rs."+balence);
			notify();  // you call notify()
		}
	}
	public class InterThread{
		public static void main(String[] args) {
			Customer customer = new Customer();
			new Thread("riya") {
				public void run() {customer.withdraw(15000);};
			}.start();
			new Thread("priya") {
				public void run() {customer.deposit(20000);};
			}.start();
		}
	}


