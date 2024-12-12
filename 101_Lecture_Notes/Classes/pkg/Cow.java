/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    //Global Variables
    int numberSpots;
    int moosPerHour;
    String getFlavor;
    boolean isBeef;

    
    //Constructors
    public Cow(){
        numberSpots = 17;
        getFlavor = "wagyu";
        isBeef = false;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
        }
        
    public Cow(int n, String f, boolean b){
        numberSpots = n;
        getFlavor = f;
        isBeef = b;
        if(isBeef)
            moosPerHour=0;
        else
            moosPerHour = 87;
    }
    
    public String getflavor(){
        return getFlavor;
    }
    
    public void moo(){
        if(!isBeef){
            int c = 0;
            while(c<moosPerHour){
                System.out.print("MOOOO");
                c++;
            }
        }
        
    }    
    
}
