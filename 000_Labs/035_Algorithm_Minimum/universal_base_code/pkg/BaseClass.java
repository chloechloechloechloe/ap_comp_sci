/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;
	private int[] = array;
	private int min;
	private int max;
	private double avg;
	
	public BaseClass() {
		this.min = 0;
		this.max = 0;
		this.avg = 0.0;
	}
	
	public void makeArr() {
		Random random = new Random();
		int size = random.nextInt(150) + 51;
		randomArr = new int[size];
		
		for(int i = 0; i<randomArr.length(); i++){
			randomArr[i] = random.nextInt(100) + 1;
		}
	}
	
	public void stuff(){
		int sum = 0;
		for(int num == randomArr){
			if(num > min){
				min = num;
			}
			else if(num > max){
				max = num;
			}
			sum = sum + num;
			
		}
		avg = (double)sum;
	}
	
	public void print(){
		System.out.println("Size: " + randomArr.length());
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Average: " + avg);
	}
}

