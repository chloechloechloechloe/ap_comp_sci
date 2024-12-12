/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	public int Strength;
	public int Dexterity;
	public int Intelligence;
	public int Charisma;
	
	public myCharacter() {
		public String(){
			role = "no role";
		}
		public String(String role){
			String.out.println("What is your role?");
			role = sc.nextLine(System.in);
		}
		public int Strength(int strength){
			strength = sc.nextInt(System.in);
		}
		public int Dexterity(int dexterity){
			dexterity = sc.nextInt(System.in);
		}
		public int Intelligence(int intelligence){
			intelligence = sc.nextInt(System.in);
		}
		public int Charisma(int charisma){
			charisma = sc.nextInt(System.in);		}
		
	}
	
	public void String myToString(String role, int strength, int dexterity, int intelligence, int charisma){
	System.out.println("Role: " + role);
	System.out.println("Strength: " + strength);
	System.out.println("Dexterity: " + dexterity);
	System.out.println("Intelligence: " + intelligence);
	System.out.println("Charisma: " + charisma);
	 }

}
