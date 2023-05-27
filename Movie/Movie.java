import java.util.List;
import java.util.ArrayList;
/**
 * Movie class that encapsulates some basic information about a movie
 */
public class Movie 
{
    // instance variables 
    private String title;   // the title of the movie

    private int year;       // the year of the movie

    private List<String> actors = new ArrayList<>(); // a List of the main actors in the movie
    

    /**
     * Constructor for objects of class Movie
     * pre-condition: the actors' names will be passed in as: 
     * FirstName LastName 
     * with no commas. 
     * Note: Some actors do not have a last name, like Madonna.
     */
    public Movie(String title, int year, List<String> actors){
        this.title = title;
        this.year = year;
        this.actors = actors;
    }

    /**
     * returns the title of the movie
     */
    public String getTitle()  
    {
        return title;
    }
    
    /**
     * returns the year the movie was released
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * returns a List of all the main actors in the movie
     */
    public List<String> getActors()
    {
        return actors;
    }
    
    /**
     * returns a String representation of a Movie object 
         in the format:
         
         Title: 101 Dalmatians 
         Year: 1999
         Actors : [John Benfield, ... , Mark Williams]
     */
    public String toString()
    {
        return ("Title: " + title + "\n" + "Year: " + year + "\n" + "Actors: " + actors);
    }
    
    /**
     * Returns true if both the year and title of this and that are equal
     */
    public boolean equals(Object that){
       if (this.title.equals(((Movie)that).getTitle()) && (this.year == ((Movie)that).getYear())) return true;
       return false;
    }
    
}
