/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		System.out.println("Please enter an integer: ");
		int number = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int number2 = sc.nextInt();
		
		System.out.println("Your range is " + number + " to " + number2 + ".");
		System.out.println("Here are 5 random numbers generated in that range.");
		System.out.println((int)(Math.random()*(number2 - number)+number) + ", " + (int)(Math.random()*(number2 - number)+number) + ", " + (int)(Math.random()*(number2 - number)+number) + ", " + (int)(Math.random()*(number2 - number)+number) + ", " + (int)(Math.random()*(number2 - number)+number));
		
		
	}
}
