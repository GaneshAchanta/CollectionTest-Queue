package queue;
import java.util.*;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		deque.add("Java");
		deque.add("Oracle");
		System.out.println(deque);
		
		//remove element from rear end
		deque.pollLast();
		System.out.println("After pollLast() Traversal....");
		System.out.println(deque);
		
		//remove element from head
		deque.poll();
		System.out.println(deque);
		
		//element added at rear end
		deque.offer("Python");
		System.out.println(deque);
		
		//element added at head
		deque.offerFirst("Adv.Java");
		System.out.println(deque);

	}

}
