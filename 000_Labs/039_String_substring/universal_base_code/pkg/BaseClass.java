/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		
		
	}
	public void printLetter(String word){
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			System.out.println(letter);
		}
	}
	}

}

