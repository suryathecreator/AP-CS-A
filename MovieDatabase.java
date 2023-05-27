import java.util.List;
import java.util.ArrayList;
import java.util.*;

/**
 *  A MovieDatabase is a mutable collection of Movie objects
 */
public class MovieDatabase 
{
    // A MovieDatabase HAS-A Movie
    private List<Movie> movieList;  // a List of all Movie objects in this particular MovieDatabase

    /**
     * initializes a MovieDatabase -- the database starts empty
     */
    public MovieDatabase()  
    { 
        movieList = new ArrayList<>();
    }

    /**
     * adds a Movie to the database, in no particular order
     */
    public void addMovie(Movie movie)
    {
        this.movieList.add(movie);
    }
    
    /**
     * searches the database for Movie titles that contain the keyword
     * for example: search("Dalmation") returns a List containing
     * only one movie: the movie associated with "101 Dalmations"
     * If no movies are found, return an empty List
     */
    public List<Movie> search(String keyword)
    {
        List<Movie> searchResults = new ArrayList<>();
        for (Movie k : movieList)
        {
            if (k.getTitle().contains(keyword))
            {
                searchResults.add(k);
            }
        }
        return searchResults;
    }
                                    
   /**
    * Returns a List of all Movie objects in which a person acted.
    * If no movies are found with this actor, return an empty List.
    * 
    * Note: the actor's name must be an exact match. 
    * 
    * For example, findMoviesWithActor("Bacon") would return an empty List
    * but findMoviesWithActor("Kevin Bacon") might return the movies 
    * Animal House, Apollo 13, and A Few Good Men.
    */

   
   public List<Movie> findMoviesWithActor(String person)
   {
//  System.out.println("Person: " + person);
        List<Movie> searchResults = new ArrayList<>();
        for (Movie k : this.movieList)
        {
//          System.out.println(k.getActors());
            for (String j : k.getActors())
            {
//              System.out.println(j);
                if (j.equals(person)) 
                {
                    searchResults.add(k);
                    break;
                }
            }
        }
        return searchResults;
   }
   
   
    
    /**
     * This method takes the most amount of work and is the most important. 
     * It loops through a List of movies formatted in the following way (as seen in the text file):
     * 
     * title: (year)/Last Name of Actor 1, First Name of Actor 1/Last Name of Actor 2, First Name of Actor 2/...
     * 
     * For example
     * Ace Ventura: When Nature Calls (1995)/Akinnuoye-Agbaje, Adewale/Allen, Kayla/...
     * 
     * From this long String, extract the following:
     * 1. movie title
     *    e.g. Ace Ventura: When Nature Calls
     * 2. year
     *    e.g. 1995
     * 3. List of actors. Each actor should be parsed to match this format:
     *              FirstName LastName 
     *    with no commas.
     *    e.g. [Adewale Akinnuoye-Agbaje, Kayla Allen, ...]
     *    Note: Some actors do not have a last name, like Madonna.
     *    
     *    
     * After extracting this information, instantiate a Movie object with all of 
     * these data fields and add it to this MovieDatabase using the addMovie method. 
     * 
     * Repeat this for each of the movies in movieList.
     * Hint: the split() method in the String class is particularly useful.
     * For example, "dog/cat/sat".split("/") returns the following array:
     *      ["dog", "cat", "sat"]
     */
    void addUnformattedMoviesToDatabase(List<String> movieList){
        String title, actor;
        int year;
        String[] split;
        List<String> actors;
        for (String k : movieList)
        {
            actors = new ArrayList<>();
            split = k.split("\\(", 2);
            title = split[0];
            split = split[1].split("\\)", 2);
            year = Integer.valueOf(split[0]);
            split = split[1].split("/", 2);
            split = split[1].split("/");
            for (String name : split)
            {
                if (name.contains(","))
                {
                    actor = (name.split(", ")[1]) + " " + (name.split(", ")[0]);
                }
                else
                {
                    actor = name;
                }
                actors.add(actor);
//              System.out.println(k);
            }
//          System.out.println("This is the title: " + title);
//          System.out.println("This is the year: " + year);
//          System.out.println("This is the actors: " + actors);
            Movie movie = new Movie(title, year, actors);
            this.addMovie(movie);
        }
    }
       
    
    
}
