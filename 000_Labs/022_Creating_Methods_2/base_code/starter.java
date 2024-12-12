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
	
	System.out.println("Give me 2 values");
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	System.out.println("Here is " + x + " to the power of " + y + ":");
	int num = pow(x,y);
	
	System.out.println(num);


		
	}
	public static int pow(int x, int y){
		int yes = 0;
		int z = x;
		while (yes<y-1) {
			x = x*z;
			yes = yes + 1;
		}
		return x;
	}
}
