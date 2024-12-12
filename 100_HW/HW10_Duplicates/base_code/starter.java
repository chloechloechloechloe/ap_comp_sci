/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		int max = 4;
		int min = 1;
		int range = max - min + 1;
		
		for(int i=0; i<20; i++){
				arr[i] = ((int)(Math.random() * range) + min);
				System.out.println(arr[i]);
			}
		
		int targetNum = (int)(Math.random()*(range) + min);
		
		int counter = 0;
		int arraySizeCount = 0;
		
		for(int x=0; x<arr.length; x++){
			if(targetNum == arr[x]){
				counter ++;
			}
		}
		
		int duplicate[] = new int[counter];
		
		for(int x=0; x<arr.length; x++){
			if(targetNum == arr[x]){
				duplicate[arraySizeCount] = x;
				arraySizeCount ++;
			}
		}
		
		System.out.println("target number: " + targetNum);
		for(int i = 0; i < duplicate.length; i++){
			System.out.println("igoigoigoi " + duplicate[i]);
		}
		
		for(int x=0; x<arr.length; x++){
			if( x+1 < arr.length && arr[x] == arr[x+1]){
				int y = x+1;
				System.out.println("The duplicate value is " + arr[x]);
				System.out.println("The indexes are duplicated at: "+ x + " and :" + y);
		}

	}
		
	}
}
