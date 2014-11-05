package GoFish;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
	private ArrayList<Card> cardList;
	
	public Deck(){
		//Constructor operation. Makes a Card List of all four suits with rank from 1 to 13.
		cardList= new ArrayList<Card>(52);
		int i=0;
		for(int r=1; r <= 13;r++){
			cardList.add(i,new Card(r,"Spade"));
			i++;
			cardList.add(i,new Card(r,"Heart"));
			i++;
			cardList.add(i,new Card(r,"Dimond"));
			i++;
			cardList.add(i,new Card(r,"Club"));
			i++;
			
		}
	}
	public int size(){
		//Returns the size of the deck.
		return this.cardList.size();
		
	}
	public boolean isEmpty(){
		//Check if the deck is emptpy
		return this.cardList.size()==0;
		
	}
	public Card draw(){
		//Takes the top card from the deck and removes it.
		return this.cardList.remove(0);
	}
	
	public void shuffle(){
		//Shuffling the deck.
		int n = this.cardList.size();
		Random rng= new Random();
		for (int i=0;i<n; i ++){
			int r= i + rng.nextInt(n-i);
			Card ci=cardList.get(i);
			Card cr=cardList.get(r);
			cardList.set(r,ci);
			cardList.set(i, cr);
			
		}
	}
	

	
	
}