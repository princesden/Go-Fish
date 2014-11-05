package GoFish;

public class Card {
	
	private int rank;
	private String suit;
	
	public Card(int r, String s){
		this.rank = r;
		this.suit = s;
	
	}
	public int getRank(){
		return this.rank;
	}
	public String getSuit(){
		return this.suit;
	}
	public String toString(){
		return this.rank + " of " + this.suit;
	}
	public boolean equals(Object obj){
		Card objAsCard = (Card)obj;
		return (this.rank == objAsCard.rank) && (this.suit.equals(objAsCard.suit));
	}
		
}
