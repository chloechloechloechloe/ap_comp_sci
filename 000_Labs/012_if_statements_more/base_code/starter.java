/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an integer");
	int a = sc.nextInt();
	
	System.out.println("Enter another integer");
	int b = sc.nextInt();
	
	if(a != b){
		System.out.println("These values are different");
	}
	else{
		System.out.println("These values are equal");
	}
}
}
