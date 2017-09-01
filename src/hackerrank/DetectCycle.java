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
		assertEquals(false,hasCycle2(new Node(1,null)));
	}
	
	@Test
	public void test2() {
		
		Node node3 = new Node(3,null);
		Node node2 = new Node(2,node3);
		node3.next = node2;
		Node node1 = new Node(1,node2);
		
		assertEquals(true,hasCycle2(node1));
	}
	
	@Test
	public void test3() {
		
		Node node3 = new Node(3,null);
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1,node2);
		
		assertEquals(false,hasCycle2(node1));
	}
	
	@Test
	public void test4() {
		
		Node node4 = new Node(4,null);
		Node node3 = new Node(3,node4);
		node4.next = node3;
		Node node2 = new Node(2,node3);
		Node node1 = new Node(1,node2);
		
		
		assertEquals(true,hasCycle2(node1));
	}
	
	
	boolean hasCycle(Node head) {
	    if (head == null) return false;
	    
	    Node current = head;
	    Node next = head.next;
	    while (current != next) {
	        if (next == null || next.next == null) return false;
	        
	        current = next;
	        next = next.next.next;
	    }
	    
	    return true;
	}
	
	
	boolean hasCycle2(Node head) {
	    if (head == null) return false;
	    
	    Node current = head;
	    Node next = head.next;
	    if (next == null) return false;
	    while (next.data > current.data) {
	        if (next == null || next.next == null) return false;
	        
	        current = next;
	        next = next.next;
	    }
	    
	    return true;
	}
	
	

}
