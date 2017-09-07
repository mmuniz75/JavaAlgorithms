package hackerrank.demo;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;

public class DepthFirstSearch {

	
	HashMap<Integer,Node> nodes = new HashMap<>();
	class Node{
		int id;
		LinkedList<Node> adjacents = new LinkedList<>(); 
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	private boolean hasPathDFS(int source,int destination){
		LinkedList<Node> visited = new LinkedList<>();
		Node sourceNode = nodes.get(source);
		Node destinationnode = nodes.get(destination); 
		return hasPathDFS(sourceNode,destinationnode,visited);
	}
	
	private boolean hasPathDFS(Node source,Node destination,LinkedList<Node> visited){
		if(visited.contains(destination))
			return false;
		
		visited.add(destination);
		
		if(source==destination)
			return true;
		
		for(Node child:destination.adjacents)
			return hasPathDFS(destination,child,visited);
			
		return false;
	}
	

}
