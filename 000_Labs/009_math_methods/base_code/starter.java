/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me a number");
	int x = sc.nextInt();
	System.out.println("Give me another number");
	int y = sc.nextInt();
	
	System.out.println("This is the maximum of the two numbers: " + (Math.max(x,y)));
	System.out.println("This is the square root of the second number: " + (Math.sqrt(y)));
	System.out.println("This is the power of the first number to the second number: " + (Math.pow(x,y)));
	}

}