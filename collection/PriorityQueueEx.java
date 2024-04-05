package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String>queue =new PriorityQueue<String>();
		queue.add("Jasmin");
		queue.offer("Lotus");
		queue.offer("Rose");
		queue.offer("Mogra");
		queue.offer("Lilly");
		
		//queue.offer(null);you can't store null
		
	System.out.println("Queue : "+queue);
	System.out.println("head og queue : "+queue.element());
	System.out.println("removing element : "+queue.remove());
	System.out.println("after removing queue : "+queue);
	System.out.println("removing element : "+queue.poll());
	System.out.println("after removing queue : "+queue);
	}
}
