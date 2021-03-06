package hackerrank;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearch  {
	
	
	 class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data,Node left,Node right){
        	this.data=data;
        	this.left=left;
        	this.right=right;
        }
        
        public Node(int data){
        	this.data=data;
        }
        
     }
	 
	 private Node sortedArrayToBST(int arr[], int start, int end) {

 		/* Base Case */
 		if (start > end) {
 			return null;
 		}

 		/* Get the middle element and make it root */
 		int mid = (start + end) / 2;
 		Node node = new Node(arr[mid]);

 		/* Recursively construct the left subtree and make it
 		left child of root */
 		node.left = sortedArrayToBST(arr, start, mid - 1);

 		/* Recursively construct the right subtree and make it
 		right child of root */
 		node.right = sortedArrayToBST(arr, mid + 1, end);
 		
 		return node;
 	}
	
	 @Test
	 public void testLong1() {
	    Node node = sortedArrayToBST(new int[]{1,2,3,4,5,6,7}, 0,6 );
		assertTrue("It is not binary search",checkBST(node));
	}
	 
	 
	public void testLong2() {
	    Node node = sortedArrayToBST(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}, 0,30 );
		assertTrue("It is not binary search",checkBST(node));
	}
	 
	 
	@Test
	public void test1() {
		Node node1 = new Node(1,null,null);
		Node node3 = new Node(3,null,null);
		Node node5 = new Node(5,null,null);
		Node node7 = new Node(7,null,null);
		Node node2 = new Node(2,node1,node3);
		Node node6 = new Node(6,node5,node7);
		Node node4 = new Node(4,node2,node6);
		
		assertTrue("It is not binary search",checkBST(node4));
	}
	
	@Test
	public void test2() {
		Node node1 = new Node(1,null,null);
		Node node3 = new Node(3,null,null);
		Node node5 = new Node(5,null,null);
		Node node7 = new Node(7,null,null);
		Node node2 = new Node(2,node1,node3);
		Node node6 = new Node(6,node5,node7);
		Node node4 = new Node(4,node6,node2);
		
		assertFalse("It is not binary search",checkBST(node4));
	}
	
	@Test
	public void test3() {
		Node node1 = new Node(1,null,null);
		Node node3 = new Node(3,null,null);
		Node node5 = new Node(5,null,null);
		Node node7 = new Node(7,null,null);
		Node node2 = new Node(2,node1,node3);
		Node node6 = new Node(6,node7,node5);
		Node node4 = new Node(4,node2,node6);
		
		assertFalse("It is not binary search",checkBST(node4));
	}

	@Test
	public void test4() {
		Node node1 = new Node(1,null,null);
		Node node3 = new Node(3,null,null);
		Node node5 = new Node(5,null,null);
		Node node7 = new Node(7,null,null);
		Node node2 = new Node(2,node3,node1);
		Node node6 = new Node(6,node5,node7);
		Node node4 = new Node(4,node2,node6);
		
		assertFalse("It is not binary search",checkBST(node4));
	}
	
		
	boolean checkBST(Node root) {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkBST(Node node, int min, int max) {
        if (node == null) return true;
        return  min < node.data && node.data < max && 
            checkBST(node.left, min, node.data) && 
            checkBST(node.right, node.data, max);
    }
	
		
}
