/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
	}
}
