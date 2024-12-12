/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What day is it today?");
	System.out.println("Sunday = 0");
	System.out.println("Monday = 1");
	System.out.println("Tuesday = 2");
	System.out.println("Wednesday = 3");
	System.out.println("Thursday = 4");
	System.out.println("Friday = 5");
	System.out.println("Saturday = 6");

	int day = sc.nextInt();
	
	if(day==0 || day==6) {
		System.out.println("Wake up at 10:00 am.");
	}
	else if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
		System.out.println("Wake up at 7:00 am");
	}
	else{
		
	}
}
}

