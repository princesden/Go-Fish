package GoFish;

public class Person {
	private String name;
	private Hand playerhand;

	
	public Person(String n){
		//Constructor
		this.name=n;
		playerhand = new Hand();
		//Will call the Address call from here
		//ADD in ADDRESS HERE
	}
	public void name(){
		//Return the name of the person
		System.out.println(this.name);
	}
	public Hand hand(){
		return this.playerhand;
	}
	public void addhand(Hand h){
		playerhand= h;
	}
	public void deletehand(){
		playerhand = null;
	}
	public void takecard(Card c){
		playerhand.addcard(c);

	}
	public void showhand(){
		playerhand.printhand();
		}
	}

