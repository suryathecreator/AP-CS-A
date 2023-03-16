/**
 * Starter code for RyhmingWords.java
 */
import java.util.*;
import java.io.*;
public class RhymingWords
{
     public static void main(String[] args){
        // make sure you download wordlist.txt 
        List<String> words = readFile("wordlist.txt");
        Scanner scanner = new Scanner(System.in);
        String wantedWord;
        int wantedIndex = 0;
        System.out.println("Number of words input: " + words.size());
        System.out.println("The first word is: " + words.get(0));
        System.out.println("The last word is: " + words.get(words.size()-1));
        // your code here   
        for (int i = 0; i < words.size(); i++)
        {
            words.set(i, reverseString(words.get(i)));
        }
        Collections.sort(words);
        for (int i = 0; i < words.size(); i++)
        {
            words.set(i, reverseString(words.get(i)));
        }
        System.out.print("What word shall I search for? ");
        wantedWord = scanner.nextLine();
        wantedIndex = words.indexOf(wantedWord);
        if (wantedIndex == -1)
        {
            System.out.println("Sorry, word not found!");
        }
        else
        {
            for (int i = (wantedIndex - 10); i < (wantedIndex + 11); i++)
            {
                System.out.println(words.get(i)); // words.get(int) throws an index out of bounds exception, so i am not worrying about if there are (10) words in front and behind of the wantedWord.
            }
        }
     }
         
    
    
     /**
      * Reads in all words from a text file and returns it as a List of String 
objects
      */
     public static List<String> readFile(String fileName){
        // Location of file to read
        File file = new File(fileName);
        List<String> words = new ArrayList<>();
 
        try 
        {
 
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) 
            {
                words.add(scanner.nextLine());   
            }
            scanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        return words;
     }

     public static String reverseString(String input)
     {
        if (input.length() == 0)
        {
            return input;
        }
        return (reverseString(input.substring(1)) + input.substring(0, 1));
     }
}