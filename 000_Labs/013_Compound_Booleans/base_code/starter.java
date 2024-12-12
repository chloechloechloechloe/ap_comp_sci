/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer");
		int x = sc.nextInt();
		System.out.println("Give me another integer");
		int y = sc.nextInt();
		System.out.println("Give me a third integer");
		int z = sc.nextInt();
		
	if(x > y && x > z) {
		System.out.println(x + " is the largest integer");
	}
	else if(y > x && y > z) {
		System.out.println(y + " is the largest integer");
	}
	else{
		System.out.println(z + " is the largest integer");
	}
	
	if(x < y && x < z){
		System.out.println(x + " is the smallest integer");
	}
	else if(y < x && y < z){
		System.out.println(y + " is the smallest integer");
	}
	else{
		System.out.println(z + " is the smallest integer");
	}
}
}
