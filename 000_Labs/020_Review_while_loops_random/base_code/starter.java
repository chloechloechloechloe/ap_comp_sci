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
		System.out.println("Enter a number 1-1000");
		int guess = sc.nextInt();
		int secret = ((int)Math.random()*1000);
		
		while(true){
			if(guess == secret){
				System.out.println("You won!");
				break;
			}
			else if(guess != secret) {
				System.out.println("Guess again");
				guess = sc.nextInt();
			}
			else{
				
			}
		}



		
	}
}
