package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Queue = FIFO data structure. First in First out.
		// 		   A collection designed to hold elements prior to processing
		//         Linear data structure
		//         add = enqueue, offer()
		//         remove = dequeue, poll()
 		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("Yankees");
		queue.offer("Red Sox");
		queue.offer("Astros");
		queue.offer("Dodgers");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.contains("Yankees"));
	}

}
