/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number between 1 and 1000");
	int guess = sc.nextInt();
	int correct = (int)(Math.random()*1000);
	
	if(guess == correct){
		System.out.println("You won!");
	}
	else if(guess > correct){
		System.out.println("Too high");
	}
	else if(guess < correct){
		System.out.println("Too low");
	}
	else{}
	}
}
