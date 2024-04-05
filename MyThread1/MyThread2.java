package MyThread1;

public class MyThread2 implements Runnable{
	
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		Thread thread1 = new Thread (MyThread);
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2=new Thread(myThread);
		thread2.setName("Thread2");
		thread2.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("executing thread :"+ Thread.currentThread().getName());
		
	}
	
	
	}


