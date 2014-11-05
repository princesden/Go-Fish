package GoFish;

import java.util.ArrayList;
import java.util.Scanner;



// This is the master class in some ways.
public class Game {
	private Deck gameDeck;
	private ArrayList<Person> playerlist;


	
	public Game(ArrayList<Person> list){
		this.gameDeck = new Deck();
		gameDeck.shuffle();
		playerlist= list;	
	}
	////////// This is not the first thing called//////
	
	///Start() is called by deal();
	public void start(){
		
		
		System.out.println("Into Start");
		int s = playerlist.size();
		int i = 0;
		Scanner in;
		int x;
		
		//while(gameDeck.isEmpty()==false){
			Person currentplayer= playerlist.get(i%s);
			Turn turn1 = new Turn(i,currentplayer);
			in = new Scanner(System.in);
			System.out.println("who should we ask?");
			int y = in.nextInt();
			System.out.println("What should we ask for? ");
			x = in.nextInt();
			System.out.print("///////");
			System.out.print(x);

			turn1.ask(playerlist.get(y),x);
			System.out.println("asked");
			allhands();
			
		}
		//System.out.println("Game deck is empty");
	
	
		
		
	
	
	
	public void deal(){
		// Deal out 7 Cards to each player
		for(int i=1;i<=7;i++){
			for(int k =0; k< playerlist.size();k++){
				Person tempPerson=playerlist.get(k);
				Card tempCard = gameDeck.draw();
				tempPerson.takecard(tempCard);
			}
		}
		
		
	/////Check if people have cards////////////////////////
///////////////////////////This will be deleted later/////////////////////////////////////////////
	System.out.println(" A List of players and their hands.");
	for(int m=0; m<playerlist.size();m++){
		Person anothertemp=playerlist.get(m);
		anothertemp.name();
		anothertemp.showhand();
	}
////////////////////////////////////////////////////////////////////////////////////////////////
	start();
	}
	
	
//////////////////////// This is a function that shows everyones hand. Just for demo purposes
	public void allhands(){
		System.out.println(" A List of players and their hands.");
		for(int m=0; m<playerlist.size();m++){
			Person anothertemp=playerlist.get(m);
			anothertemp.name();
			anothertemp.showhand();
		}
		
	}
	
}
