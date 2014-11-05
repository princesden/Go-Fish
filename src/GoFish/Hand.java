package GoFish;

import java.util.ArrayList;


public class Hand {
	private ArrayList<Card> cardlist;
	
	public Hand(){
		cardlist = new ArrayList<Card>();
	}
	public void printhand(){

		for(int i =0; i< cardlist.size(); i++){
			Card tempcard = cardlist.get(i);
			System.out.println(tempcard.toString());
		}
	}
	
	public void addcard(Card c){
		cardlist.add(c);
	}
	
	public int size(){
		return this.cardlist.size();
	}
	
	public boolean isempty(){
		return this.cardlist.size()==0;
	}
	
	
	public boolean checkfor(int c1rank){
		/*This is to check if a given card is in the hand. 
		 * Will return true if it is in hand.
		 * This should be used with a whileloop to insure you get all the cards you asked for
		 * 
		 */
		
		for(int i=0;i< cardlist.size();i++){
			Card c2 = cardlist.get(i);
			int c2rank = c2.getRank();
			if(c1rank == c2rank){
				return true;
			}
		}
	
	 return false;
	}
	public Card give(int c1rank){
		
		//This function should not be called without calling the checkfor first
		//int c1rank=c1.getRank();
		for(int i=0; i<cardlist.size();i++){
			Card c2 = cardlist.get(i);
			int c2rank= c2.getRank();
			if(c1rank==c2rank){
				Card gift = cardlist.remove(i);
				return gift;
			}
		}
		return null;
	}
}
