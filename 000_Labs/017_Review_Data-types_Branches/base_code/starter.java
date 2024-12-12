/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name");
	String name = sc.nextLine();
	
	System.out.println(name + ", what is your title?");
	String title = sc.nextLine();
	System.out.println("Hello, " + name + ", " + title);
	
	System.out.println("Choose a role - wizard, warrior, rogue");
	String role= sc.nextLine();
	
	if(role.equals("wizard") || role.equals("wizard")) {
		System.out.println("you chose wizard");
	}
	else if(role.equals("Rogue") || role.equals("rogue")){
		System.out.println("you chose rogue");
	}
	else if(role.equals("Warrior") || role.equals("warrior")){
		System.out.println("you chose warrior");
	}
	else{
		System.out.println("Wrong input");
	}
		
		System.out.println("You get 20 points to spend on traits: ");
		int points = 20;
		System.out.println("Strength - Buff and able to carry larger items (1-10)");
		int strength = sc.nextInt();
		
		if(strength > 10){
			System.out.println("Input a smaller value");
		}
		else if(strength <= 10){
			points = (points-strength);
			System.out.println("You have " + strength + " points in strength and " + points + " points remaining");
		}
		else{
			
		}
		
		
		System.out.println("Dexterity - Agile and moves quick (1-10)");
		int dexterity = sc.nextInt();
		
		if(dexterity > 10){
			System.out.println("Input a smaller value");
		}
		else if(dexterity <= 10){
			points = (points-dexterity);
			System.out.println("You have " + dexterity + " points in strength and " + points + " points remaining");
	}
		else{
			
		}
		
		System.out.println("Intelligence - Better at magic spells! (1-10)");
		int intelligence = sc.nextInt();
		
		if(intelligence > 10){
			System.out.println("Input a smaller value");
		}
		else if(intelligence <= 10){
			points = (points-intelligence);
			System.out.println("You have " + intelligence + " points in strength and " + points + " points remaining");
		}
		else{
			
		}
		

		
		System.out.println("Charisma - How personable (1-10)");
		int charisma = sc.nextInt();
		
		if(charisma > 10){
			System.out.println("Input a smaller value");
		}
		else if(charisma <= 10){
			points = (points-charisma);
			System.out.println("You have " + charisma + " points in strength and " + points + " points remaining");
		}
		else{
			
		}
		System.out.println("Your name is " + name + ", title is " + title +  ", and your stats are: " + "Strength: " + strength + ", Dexrerity: " + dexterity + ", Intelligence: " + intelligence + ", Charisma: " + charisma);
	}

	}
	


