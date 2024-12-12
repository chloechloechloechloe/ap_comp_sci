/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your first name?");
	String name = sc.nextLine();
	System.out.println("Your first name is " + name);
	
	System.out.println("What is your age?");
	int age = sc.nextInt();
	System.out.println("You are " + age + " years old");
	
	System.out.println("What is the month of your birthday?");
	String month = sc.nextLine();
	System.out.println("You were born in " + month);
	
	System.out.println("What is the day of your birthday?");
	int birthday = sc.nextInt();
	System.out.println("You were born on " + month + " " + birthday);
	
	System.out.println("What is the year of your birthday?");
	int year = sc.nextInt();
	System.out.println("You were born " + month + " " + birthday + ", " + year);
	
	System.out.println("How much is a buck fifty?");
	double money = sc.nextDouble();
	System.out.println("A buck fifty is $" + money);
	}
}
