/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter an integer.");
	int x = sc.nextInt();
	

	
	System.out.println("Please enter another integer.");
	int y = sc.nextInt();


	
	if((x%2)==0){
		System.out.println(x + " is even.");
	}
	else {
		System.out.println(x + " is odd");
	}
	
	if((x%3)==0){
		System.out.println(x + " is divisible by 3.");
	}
	else {
			
	}
	
	if((x%4)==0){
		System.out.println(x + " is divisible by 4.");
	}
	else{
		
	}
	
	if((x%5)==0){
		System.out.println(x + " is divisible by 5.");
	}
	else{
		
	}
	
	if((x%3)!=0 && (x%4)!=0 && (x%5)!=0){
		System.out.println(x + " is not divisible by 3, 4, or 5.");
	}
	else{
		
	}
	
	
	if((y%2)==0){
		System.out.println(y + " is even.");
	}
	else {
		System.out.println(y + " is odd");	
	}
	
	
	if((y%3)==0){
		System.out.println(y + " is divisible by 3.");
	}
	else {
			
	}
	
	if((y%4)==0){
		System.out.println(y + " is divisible by 4.");
	}
	else{
		
	}
	
	if((y%5)==0){
		System.out.println(y + " is divisible by 5.");
	}
	else{
		
	}
	
	if((y%3)!=0 && (y%4)!=0 && (y%5)!=0){
		System.out.println(y + " is not divisible by 3, 4, or 5.");
	}
	else{
		
	}
	
	}
}
