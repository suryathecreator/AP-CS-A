 
/**
 * In this program, I use the Babylonian method to approximate a square root. 
 * Your input will be the number you want to approximate the square root of.
 * Your output will be the approximate square root of the number you inputted. 
 * @author Surya Duraivenkatesh
 * @version 09/10/2022
 */
public class Babylonian
{   
    
    /**
     * This method computes the square root of a positive number using the Babylonian algorithm.
     * 
     * The Babylonian algorithm to compute the square root of a positive number n is as follows:
     * 1. Make a guess at the answer (pick n/2 as your initial guess).
     * 2. Compute r = n / guess
     * 3. Set guess = (guess +r)/ 2
     * 4. Go back to step 2 for five iterations
     * 
     * 
     * @param n a positive number 
     * @return an approximation of the square root of n using the Babylonian algorithm
     */ 
    double squareRoot(double n){
        double guess = n/2, r;
        for(int i = 0; i < 5; i++)
        {
            r = n/guess;
            guess = (guess + r)/2;
        }
        return guess;
    }
    
}