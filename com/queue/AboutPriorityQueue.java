/*queue:
 * Java Queue interface orders the element in FIFO(First In First Out) manner. 
 * In FIFO, first element is removed first and last element is removed at last.
 * 
 * priority Queue:
 * The PriorityQueue class provides the facility of using queue.
 *  But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
 * 
 *
 */


package com.queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class AboutPriorityQueue {
	public static void main(String[] args) {
		
		
		        // Creating empty priority queue
		        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(3);
		 
		        // Adding items to the pQueue using add()
		        pQueue.add(10);
		        pQueue.add(5);
		        pQueue.add(15);
		        pQueue.add(3);
		        
//		        The offer(E e) method of Queue Interface inserts the specified element into this queue 
//		        if it is possible to do so immediately without violating capacity restrictions.
//		        This method is preferable to add() method since this method does not throws an exception 
//		        when the capacity of the container is full since it returns false.
		        pQueue.offer(100);
		 
		     
		        Iterator<Integer> iterator = pQueue.iterator();
		        
		        while (iterator.hasNext()) {
		            System.out.print(iterator.next() + " ");
		        }
		        System.out.println();

		        // Printing the top element of PriorityQueue
		        System.out.println(pQueue.peek());
		 
		        // Printing the top element and removing it by using poll method
		        System.out.println("poll method:"+pQueue.poll());
		        System.out.println("After Poll method the elements in priority queuer are:"+pQueue);
		        
		        //removing the particular element from  PriorityQueue
		        pQueue.remove(5);
		        System.out.println("after removing element 5:"+pQueue);
		        pQueue.clear();
		        System.out.println("clear method:"+pQueue);
		 
		    }
	}

