package MyThread1;

public class SynchronizedBlock {

	class PrintTable {
		public void print(int n) {
			synchronized (this) {
				for (int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i * n);
				}
			}
		}
	}

	class Thread1 extends Thread {
		PrintTable printTable;

		public Thread1(PrintTable printableTable) {
			this.printTable = printableTable;

		}

		@Override
		public void run() {
			printTable.print(4);
		}
	}

	public class SynchronizedBlockEx {
		public static void main(String[] args) {
			PrintTable printTable = new PrintTable();
			Thread1 thread1 = new Thread1(printTable);
			thread2 thread2 = new Thread2(printTable);
			thread1.start();
			thread2.start();
	}
}
}
