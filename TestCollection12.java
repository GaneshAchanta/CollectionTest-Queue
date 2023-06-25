package queue;
import java.util.*;

public class TestCollection12 {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Balu");
		queue.add("Eswar");
		queue.add("Rahul");
		System.out.println(queue);
		System.out.println("Head : "+queue.element());
		System.out.println(queue);
		System.out.println("Head : "+queue.peek());
		System.out.println(queue);
		System.out.println("Head : "+queue.poll());
		System.out.println(queue);
		System.out.println("Iterating the queue elements :");
		Iterator <String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
