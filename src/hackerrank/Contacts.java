package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

import org.junit.Test;

public class Contacts {

	
	
	@Test
	public void test1(){
		String commands = "add,hack,add,hackerrank,find,hac,find,hak";
		StringTokenizer in = new StringTokenizer(commands,",");

		List<String> contacts = new ArrayList<>();
		while(in.hasMoreTokens()){
            String op = in.nextToken();
            String contact = in.nextToken();
            
            if (op.equals("add"))
            	contacts.add(contact);
            
            if (op.equals("find"))
            	System.out.println(find(contact,contacts));
        }
	}
	
	private int find(String key,List<String> contacts){
		int count = 0;
		for(String contact:contacts){
			if(contact.startsWith(key))
				count++;
		}
		return count;
	}
	
	@Test
	public void test2(){
		String commands = "add,hack,add,hackerrank,find,hac,find,hak";
		StringTokenizer in = new StringTokenizer(commands,",");

		while(in.hasMoreTokens()){
            String op = in.nextToken();
            String contact = in.nextToken();
            
            if (op.equals("add"))
            	add(contact);
            
            if (op.equals("find")){
            	int count = contactsMap.containsKey(contact)?contactsMap.get(contact).size():0;
            	System.out.println(count);
            }	
        }
	}

	
	HashMap<String,List> contactsMap = new HashMap<>();
	private void add(String contact){
		
		for(int i=1;i<=contact.length();i++){
			String key = contact.substring(0, i);
			List contacts = null;
			if(contactsMap.containsKey(key))
				contacts = contactsMap.get(key);
			else 
				contacts = new ArrayList();
			
			contacts.add(contact);
			contactsMap.put(key, contacts);	
		}
	}
	
}
