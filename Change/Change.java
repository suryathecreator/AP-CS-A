 
/**
 * In this program, we convert cents to quarters, dimes, nickels. 
 * Our input is cents.
 * Our output is those cents in quarters, dimes, nickels.
 * 
 * @author Surya Duraivenkatesh
 * @version 09/11/2022
 */
public class Change{
    
    
    /**
     * converts cents to quarters, dimes, nickels
     * 
     * precondition: cents is between 0 and 75, inclusive
     * 
     * @param cents the number of cents
     * @return a String in the form "q quarters, d dimes, and n nickels"
     */ 
     public String cashInCoins(int cents){
        int quarters, dimes, nickels;
        quarters = cents / 25;
        dimes = (cents - (quarters * 25)) / 10;
        nickels = (cents - (quarters * 25) - (dimes * 10)) / 5;
        return quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels";
     }
         
 }