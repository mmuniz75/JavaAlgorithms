package hackerrank;

import java.util.ArrayDeque;
import java.util.HashSet;
import static org.junit.Assert.*;

import org.junit.Test;

public class ShortestReachGraph {
	private static final int EDGE_WEIGHT = 6;
		
	@Test
	public void test() {
		Node node3 = new Node(3);
		Node node2 = new Node(2);
		Node node1 = new Node(1);
		Node node4 = new Node(4);
		node1.addNeighbor(node2);
		node1.addNeighbor(node3);
		
		findDistances(node1);
		assertEquals(6,node2.distance);
		assertEquals(6,node3.distance);
		assertEquals(-1,node4.distance);
		
	}
	
	private void findDistances(Node start) {
        if (start == null) {
            return;
        }
        ArrayDeque<Node> deque = new ArrayDeque<>(); // use deque as a queue
        start.distance = 0;
        deque.add(start);
        while (!deque.isEmpty()) {
            Node curr = deque.remove();
            for (Node neighbor : curr.neighbors) {
                if (neighbor.distance == -1) { // meaning it's unvisited
                    neighbor.distance = curr.distance + EDGE_WEIGHT;
                    deque.add(neighbor);
                }
            }
        }
    }
    
    /* Implementation of an UNDIRECTED graph */
    public class Node {
        public final int     id; // each Node will have a unique ID
        public int           distance; // Also tells us if Node has been visited (-1 means unvisited)
        public HashSet<Node> neighbors;
        
        public Node (int id) {
            this.id   = id;
            distance  = -1;
            neighbors = new HashSet<>();
        }
        
        public void addNeighbor(Node neighbor) {
            neighbors.add(neighbor);
            neighbor.neighbors.add(this);
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            } else if (other == null || !(other instanceof Node)) {
                return false;
            }
            Node otherNode = (Node) other;
            return this.id == otherNode.id;
        }

        @Override
        public int hashCode() {
            return id; // simple and effective
        }
    }

}
