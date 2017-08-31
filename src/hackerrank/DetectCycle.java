package hackerrank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DetectCycle {
	
	 class Node {
	    public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
			int data;
	        Node next;
	    }

	@Test
	public void test() {
		assertEquals(false,hasCycle(new Node(1,null)));
	}
	
	@Test
	public void test2() {
		
		Node node3 = new Node(3,null);
		Node node2 = new Node(2,node3);
		node3.next = node2;
		Node node1 = new Node(1,node2);
		
		assertEquals(true,hasCycle(node1));
	}
	
	@Test
	public void test3() {
		
		Node node3 = new Node(3,null);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1,node2);
		
		assertEquals(false,hasCycle(node1));
	}
	
	
	boolean hasCycle(Node head) {
	    if (head == null) return false;
	    
	    Node slow = head;
	    Node fast = head.next;
	    while (slow != fast) {
	        if (fast == null || fast.next == null) return false;
	        
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    return true;
	}
	
	

}
