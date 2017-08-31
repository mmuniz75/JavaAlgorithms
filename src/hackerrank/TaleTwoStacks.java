package hackerrank;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.junit.Test;

public class TaleTwoStacks {

	public static class MyQueue<T> {
        private Queue<T> queue = new LinkedList<T>(); 
        
        public void enqueue(T value) { // Push onto newest stack
            queue.add(value);
        }

        public T peek() {
        	return queue.peek();
        }

        public T dequeue() {
        	return queue.poll();
        }
    }
	
	@Test
	public void test() throws Exception{
	        MyQueue<Integer> queue = new MyQueue<Integer>();

	        Scanner scan = new Scanner(new File("C:/work/workspace/JavaAlgorithms/src/hackerrank/TaleTwoStacks.in"));
	        int n = scan.nextInt();

	        for (int i = 0; i < n; i++) {
	            int operation = scan.nextInt();
	            if (operation == 1) { // enqueue
	              queue.enqueue(scan.nextInt());
	            } else if (operation == 2) { // dequeue
	              queue.dequeue();
	            } else if (operation == 3) { // print/peek
	              System.out.println(queue.peek());
	            }
	        }
	        scan.close();
	    }

}
