/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;



class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int x = 100;
		int [] wizards = new wizards[x];
		int [] warriors = new warriors[x];
		
		for(int i = 0; i<x; i++){
			wizards[i] = new String("wizard " + (i + 1));
			warriors[i] = new String("warrior " + (i+1));
		}
		
		int warriorx = 0;
		int wizardx = 0;
		
		while(warriorx < x && wizardx < x){
			nowwizard =  wizards[wizardx];
			nowwarrior = warriors[warriorx];
		}
		
	}
}
