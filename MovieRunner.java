/**
 * SAMPLE RUN: (Feel free to edit to your own liking)
 * 
 * Welcome to The OHS Pixel Movie Database
 * 
 * Options
 * 1) Find all movies with a particular actor.
 * 2) Search for a movie by keyword.
 * 3) Exit
 * 
 * Choice: 1
 * Enter actor's name:
 * Kevin Bacon
 * 
 * Finding movies with Kevin Bacon...
 * [Animal House,1978, Actors:[Karen Allen, Kevin Bacon, ...,James Widdoes],
 *  Apollo 13,1995, Actors:[Ivan Allen, David Andrews, Kevin Bacon, ...,Walter von Huene],
 *  Few Good Men, A, 1992, Actors:[Kevin Bacon, Xander Berkeley, ..., Noah Wyle] ]
 * 
 * Options
 * 1) Find all movies with a particular actor.
 * 2) Search for a movie by keyword.
 * 3) Exit
 * 
 * Choice: 2
 * Enter search keyword: Ghost
 * 
 * Finding movies with the word "Ghost" in the title.... 
 * [ Ghost, 1990, Actors [Rick Aviles, Alma Beltran, ..., Charlotte Zucker],
 *   Ghostbusters, 1984, Actors: [William Atherton, Dan Aykroyd, ..., Christopher Wynkoop],
 *   Ghostbusters II, 1989, Actors: [Dan Aykroyd, Robert Alan Beuth, ..., Wilhelm von Homburg] ]
 * 
 */

import java.util.*;
import java.io.*;

public class MovieRunner 
{
    public static void main(String[] args)
    {
        List<String> movieList = readFile("movies-top-grossing.txt");
        boolean leave = false;
        int inputChoice = 0;
        String inputString = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println(movieList.size() + 
                           " movies have been imported from the file " +
                           "movies-top-grossing.txt\n" );
        System.out.println("For example, the second movie is:\n" + movieList.get(1) + "\n");
        
           
        // create an empty database
        MovieDatabase database = new MovieDatabase();
        
        // add movies to the database
        database.addUnformattedMoviesToDatabase(movieList);

        while (leave != true)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Find a movie with a word in it");
            System.out.println("2. Find a movie with an actor in it");
            System.out.println("3. Leave");
            System.out.print("Your choice is: ");
            inputChoice = Integer.valueOf(scanner.nextLine());
            if (inputChoice == 1)
            {
                System.out.print("What is the word? ");
                inputString = scanner.nextLine();
                System.out.println("Finding movies with the word \"" + inputString + "\" in the title.... \n" +
                                database.search(inputString));
            }
            else if (inputChoice == 2)
            {
                System.out.print("Who is the actor? ");
                inputString = scanner.nextLine();
                System.out.println("Finding movies with " + inputString + "...\n" + 
                                database.findMoviesWithActor(inputString));
            }
            else if (inputChoice == 3)
            {
                leave = true;
            }
        }             
    }
    
    /**
    *  method that reads in movies (in raw format) from a file
    */
    private static List<String> readFile(String fileName)
    {
        // Location of file to read
        File file = new File(fileName);
        List<String> movies = new ArrayList<String>();
        
 
        try 
        {
 
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) 
            {
                
                movies.add(scanner.nextLine());
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        return movies;
    }
}