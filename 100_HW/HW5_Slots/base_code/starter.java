/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int bet;
		System.out.println("Would you like to play?");
		String play = sc.nextLine();
		boolean stillPlaying = false; 
		boolean hasMoney = true;
		if(play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")){
			stillPlaying = true;

			while(stillPlaying && hasMoney) {
				System.out.println("How much do you want to bet");	
				bet = sc.nextInt();
				sc.nextLine();
				
				if(bet > money){
					System.out.println("You dont have enough money");
					System.out.println("Please place a new bet");
					bet = sc.nextInt();
				}
				
				money = money - bet;
				
				System.out.println("You have " + money);
				int max = 9;
				int min = 0;
				int range = max - min + 1;
				int randNums[] = new int[3];
				
				for(int i=0; i<3; i++){
					randNums[i] = ((int)(Math.random() * range) + min);
				}
				
				if(randNums[0] == randNums[1] && randNums[1] == randNums[2]){
					System.out.println("The slot rolled:");
					System.out.println(randNums[0] + " " + randNums[1] + " " + randNums[2]);
					int winnings = bet*3;
					System.out.println("you won a jackpot: " + winnings);
					
					
					money = money + winnings;
					System.out.println("You now have: " + money);
					
				}
				else if(randNums[0] == randNums[1] || randNums[0] == randNums[2] || randNums[1] == randNums[2]){
					System.out.println("The slot rolled:");
					System.out.println(randNums[0] + " " + randNums[1] + " " + randNums[2]);
					int winnings = bet*2;
					System.out.println("you won a mini jackpot: " + winnings);
					
					
					money = money + winnings;
					System.out.println("You now have: " + money);
					
				}
				else{
					System.out.println("The slot rolled:");
					System.out.println(randNums[0] + " " + randNums[1] + " " + randNums[2]);
					System.out.println("you lost");
					
					System.out.println("You now have: " + money);
					
				}
				
				if(money <= 0) {
					System.out.println("YOu are out of money!");
					break;
				}
				
			
					System.out.println("Do you want to keep playing?");
					String stopPlaying = sc.nextLine();

				if(stopPlaying.equalsIgnoreCase("no") || stopPlaying.equalsIgnoreCase("N")){
					stillPlaying = false;
				}
		
			
		} 
		
	} else {
			System.out.println("");
		}
}
}
