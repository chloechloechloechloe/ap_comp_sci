/*
    Lecture note example - If Statements
    Poole Lecture
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an Alien Exchange Program!");
	    System.out.println("Pick An Alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza");
        System.out.println("2. Bob, a blue alien who loves trees");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies");
        

        int answer1 = sc.nextInt(); // 1, 2, or 3
        
        if(answer1 == 1){
            System.out.println("You picked Joe!! WOO!");
            
            System.out.println("What will you wear?");
            System.out.println("1. nothing");
            System.out.println("2. galaxy wolf hoodie");
            System.out.println("3. nick wilde costume");
            int answer2 = sc.nextInt();
            if(answer2 == 1){
            System.out.println("you got expelled!!!!!!!!!!!!1");
            }
            else if(answer2 == 2){
            System.out.println("everyone knows ur drip.....");
            }
            else if(answer2 == 3){
                System.out.println("This is why no one likes you");
            }
            else{
                System.out.println("kys lil bru");
            }
        }
        
        else if(answer1 == 2){
            System.out.println("You picked Bob!! WOO!");
            
            System.out.println("Your new friends at school invited you to the Diddy party! Will you go?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            int answer3 = sc.nextInt();
            if(answer3 == 1){
                System.out.println("Diddy jumped u!!");
            }
            else if(answer3 == 2){
                System.out.println("watch out lil bru....");
            }
            else{
                System.out.println("k.");
            }
        }
        else if(answer1 == 3){
            System.out.println("You picked Barny!! WOO!");
            
            System.out.println("");
        }
        else{
            System.out.println("You get Jerry.");
        }
    }
}