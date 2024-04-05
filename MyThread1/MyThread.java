package MyThread1;

public class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	while(true) {
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("executing thread :"+getName());
	}
	
	}
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("Thread 1");
		thread1.start();
		
		MyThread thread2 = new MyThread();
		thread2.setName("Thread 2");
		thread2.start();
	}
}
