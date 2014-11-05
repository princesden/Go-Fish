package GoFish;

import java.util.ArrayList;


public class Test {
	public static void main(String[] args){
		System.out.println("This is a practice for the GoFish code");
		Person p1 = new Person("Ned");
		Person p2 = new Person("Adam");
		Person p3 = new Person("Kelly");
		Person p4 = new Person("Princewill");
		ArrayList<Person> listofplayers = new ArrayList<Person>(4);
		listofplayers.add(p1);
		listofplayers.add(p2);
		listofplayers.add(p3);
		listofplayers.add(p4);
		
		Game game1= new Game(listofplayers);
		game1.deal();
		System.out.println("End Game");
		
	}
}
