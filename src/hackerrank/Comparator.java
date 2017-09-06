package hackerrank;

import java.util.Arrays;

import org.junit.Test;

public class Comparator {
	/*
	amy 100
	david 100
	heraldo 50
	aakansha 75
	aleksa 150
	
	
	aleksa 150
	amy 100
	david 100
	aakansha 75
	heraldo 50
	*/
	
	@Test
	public void test() {
		Player[] players = new Player[] {new Player("amy",100),
										new Player("david",100),
										new Player("heraldo", 50),	
										new Player("aakansha",75),
										new Player("aleksa",150)
										};
		solution(players);
	}
	
	class Checker implements java.util.Comparator<Player>{

		@Override
		public int compare(Player p1, Player p2) {
			int comp = Integer.compare(p2.score,p1.score);
			if(comp == 0)
				comp = p1.name.compareTo(p2.name);
			return comp;
		}
		
	}
	
	
	class Player{
	    String name;
	    int score;
	    
	    Player(String name, int score){
	        this.name = name;
	        this.score = score;
	    }
	}



    public void solution(Player[] player) {
        
        Checker checker = new Checker();
        
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
