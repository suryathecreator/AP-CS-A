 
/**
 * Write a program that calculates the real roots of a quadratic polynomial
 * in the form ax^2 + bx + c = 0. Prompt the user for input.
 * 
 * For example, a possible sample dialogue might be the following:
 * Enter coefficients for the quadratic ax^2 + bx + c = 0.
 * a = 1
 * b = 0
 * c = -4
 * 
 * roots are 2.0 and -2.0
 * 
 * If the quadratic has no real roots, output "no real roots"
 * 
 * 
 * @author Surya Duraivenkatesh
 * @version 09/20/2022
 */
 
 import java.util.Scanner;
 
 public class QuadraticSolverMain
 {
     public static void main(String[] args){
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter coefficients for the quadratic ax^2 + bx + c = 0. a is: ");
         double a = scanner.next().charAt(0);
         System.out.println("b is: ");
         double b = scanner.next().charAt(0);
         System.out.println("c is: ");
         double c = scanner.next().charAt(0);
         scanner.close();
         QuadraticSolver solver = new QuadraticSolver();
         solver.roots(a, b, c); 
         
     }
 }