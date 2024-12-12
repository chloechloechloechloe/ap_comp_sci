/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Character myCharacter = new Character();
	System.out.println("Role: " + myCharacter.role);
	System.out.println("Strength: " + myCharacter.Strength);
	System.out.println("Dexterity: " + myCharacter.Dexterity);
	System.out.println("Intelligence: " + myCharacter.Intelligence);
	System.out.println("Charisma: " + myCharacter.Charisma);


		
	}
}

class Character {
	String role = new String("Wizard");
	int Strength = 3;
	int Dexterity = 7;
	int Intelligence = 5;
	int Charisma  = 5;
}
