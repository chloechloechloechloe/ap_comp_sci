/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter an integer");
		int x = sc.nextInt();
		printPrime();
	
	}
	public static boolean checkPrime(int x){
		if(x<=1){
			return false;
		
		}
		int h = 2;
		while (h <= Math.sqrt(x)){
			if(x%2 == 0){
				return false;
			}
			h++;
		}
		return true;
		}
	}
	public static void printPrime(int y){
		int x = 2;
		while (x < y){
			if(checkPrime(x)){
				System.out.println(x);
			}
			x++;
		}
	}
}
