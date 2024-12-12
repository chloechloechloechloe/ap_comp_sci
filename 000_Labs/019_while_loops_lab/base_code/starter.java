/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me a name.");
	String name = sc.nextLine();
	System.out.println("How many times should this name be printed?");
	int number = sc.nextInt();
	
	int c = 0;
	while(c < number) {
		System.out.println(name);
		
		if(c>=number)
		{
			break;
		}
		c=c+1;
	}
	


		
	}
}
