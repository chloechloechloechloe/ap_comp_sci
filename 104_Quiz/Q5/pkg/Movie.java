package pkg;

public class Movie{
    public String movieName;
    public double rating;
    public int numRatings;
    public int revenue;
    
    public Movie() {
        movieName = new String("Avengers");
        rating = 8.0;
        numRatings = 33;
        revenue = 62335790;
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }
    
    public Movie(String a, double b, int c, int d){
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
        System.out.println("Movie: " + a);
        System.out.println("Rating: " + b);
        System.out.println("Number of Ratings: " + c);
        System.out.println("Revenue: " + d);
        System.out.println(" ");
        
    }
    
    public String movieToString(){
        return movieName;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public void addRating(){
        
    }
    
}
