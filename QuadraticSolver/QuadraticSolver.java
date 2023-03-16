 
/**
 * In this class, we find the roots of a quadratic function. 
 * The inputs are the "a", "b", and "c" in ax^2 + bx + c = 0
 * The output are the two (or zero) roots  of the quadratic function.
 * 
 * @author Surya Duraivenkatesh
 * @version 09/20/2022
 */
public class QuadraticSolver
{
   
    /**
     * returns the roots of ax^2 + bx + c = 0 in the format:
     * "roots are r1 and r2"
     * (where r1 >= r2)
     * 
     * if the roots are non-real, returns "no real roots"
     * 
     * precondition: a is non-zero 
     */
    public String roots(double a, double b, double c){
 
       if (((b*b) - 4*a*c) < 0)
       {
            return "no real roots";
       }
       else
       {
        double r1 = (((-b) + Math.pow(((b*b) - 4*a*c), 0.5))/(2*a));
        double r2 = (((-b) - Math.pow(((b*b) - 4*a*c), 0.5))/(2*a));
        return "roots are " + r1 + " and " + r2;
       }  
    }
}