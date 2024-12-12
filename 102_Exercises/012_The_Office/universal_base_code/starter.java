/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee chloe = new Employee(1111, "Chloe", "Lee", 999999);
		chloe.employeeToString();
		
		michael.raiseSalary(10);
		double a = michael.getSalary();
		double x = michael.getAnnualSalary();
		
		jim.raiseSalary(10);
		double b = jim.getSalary();
		double y = jim.getAnnualSalary();
		
		pam.raiseSalary(10);
		double d = pam.getSalary();
		double z = pam.getAnnualSalary();
		
		chloe.raiseSalary(100);
		double f = chloe.getSalary();
		double c = chloe.getAnnualSalary();
		
		System.out.println("Raised Salaries");
		System.out.println("Michael Scott: " + a);
		System.out.println("Jim Halpert: " + b);
		System.out.println("Pam Beesly: " + d);
		System.out.println("Chloe Lee: " + f);
		System.out.println(" ");
		System.out.println("Annual Salaries:");
		System.out.println("Michael Scott: " + x);
		System.out.println("Jim Halpter: " + y);
		System.out.println("Pam Beesly: " + z);
		System.out.println("Chloe Lee: " + c);
	}
}
