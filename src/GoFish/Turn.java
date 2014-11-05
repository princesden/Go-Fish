package GoFish;

public class Turn {
	
	private int turncount; //Turn count is an int that represents the turn in sequential order 
	private Person currentplayer;
	
	public Turn(int tcount, Person p){
		//must take a turn count and a person for a hand.
		this.turncount = tcount;
		this.currentplayer = p;
		
	}
	
	public int turnnumber(){
		return this.turnnumber();
	}

	public void ask(Person opponent, int cardrank){
		System.out.println("Asking for cards!!!");
		//Ask a person at the table for a card rank.
		// 
		Hand oppnenthand = opponent.hand();
		/*While the oppent has a card you asked for keep taking  them. 
		 * Example take all of the players 3s, and not just one.  
		 
		if(oppnenthand.checkfor(cardrank)==false){
			System.out.println("GO FISH!");
			Card fishing= gameDeck.draw();
			this.currentplayer.hand().addcard(fishing);
			
		}*/
		while(oppnenthand.checkfor(cardrank)){
			Card r = oppnenthand.give(cardrank);
			this.currentplayer.hand().addcard(r);
					
		}
		
	}




}
