package MyThread1;

public class Account {
	private int balence = 5000;
	
	public int getBalence()
	{
		return balence ; 
	}
	public void withdraw(int amount) {
		balence =  balence = amount;
	}

}
