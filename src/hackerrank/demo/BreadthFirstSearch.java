package hackerrank.demo;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.junit.Test;

public class BreadthFirstSearch {

	
	HashMap<Integer,Node> nodes = new HashMap<>();
	class Node{
		int id;
		LinkedList<Node> adjacents = new LinkedList<>(); 
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	private boolean hasPathBFS(int source,int destination){
		Node sourceNode = nodes.get(source);
		Node destinationnode = nodes.get(destination); 
		return hasPathBFS(sourceNode,destinationnode);
	}
	
	private boolean hasPathBFS(Node source,Node destination){
		LinkedList<Node> visited = new LinkedList<>();
		HashSet<Node> toBeVisited = new HashSet<>();
		toBeVisited.add(source);
		
		while(!toBeVisited.isEmpty()) {
		
			if(visited.contains(destination))
				continue;
			
			visited.add(destination);
			
			if(source==destination)
				return true;
			
			for(Node child:destination.adjacents)
				toBeVisited.add(child);
		}	
			
		return false;
	}
	

}
