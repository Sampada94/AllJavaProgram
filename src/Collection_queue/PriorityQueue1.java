package Collection_queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue PQ=new PriorityQueue();
		PriorityQueue PQ1=new PriorityQueue();
		
		//insertion is not preserved
		//duplicate are allowed
		// Homogeneous type data
		// get or set method not applicable
		//null value not accetable
		
		//1 add/insertion method
		
		PQ.add('S');
		PQ.add('G');
		PQ.add('M');
		PQ.add('P');
		PQ.add('D');
	//	PQ.add("Ruby");  class cast exception
	//	PQ.add(null);
		
		System.out.println(PQ);
		
		//2 Offer method - same as add method
		PQ.offer('R');
		System.out.println(PQ);
		
//		PQ.offer("Java");  //class cast exception
//		System.out.println(PQ);
		
//		PQ.offer(null);     //NullPointerException
//		System.out.println(PQ);
		
		//3 element
		 // to find head element
		// if element not present in queue then show no such element exception 
		System.out.println(PQ.element());    //D
//		System.out.println(PQ1.element());   //NoSuchElementException
		
		//4 Peek
		
		// to show peek value ie highest value 
		// if element not present in queue then show null value
		System.out.println(PQ.peek());   //D
		System.out.println(PQ1.peek());  // null
		
		// 5 remove
		//remove the head of queue ie A
		// if element not present then show no such element exception
		
		System.out.println(PQ.remove());  //[D, P, M, S, R]
//		System.out.println(PQ1.remove());//NoSuchElementException
		
		//poll
	//	remove the head of queue ie D
		// if element not present in queue then show null value
		System.out.println(PQ.poll());  //D
		System.out.println(PQ1.poll());  // Null
		
		// reading element by using each for loop
		System.out.println("*******");
		for(Object obj:PQ) { 
			System.out.println(obj);
		}

	}

}
