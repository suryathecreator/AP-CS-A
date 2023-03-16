/**
 * 
 * Gasket.java
 * Draws a Sierpinski Triangle (Gasket) at any level of recursion, n.
 */
import java.util.*;
public class Gasket 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter depth of gasket (1-10): ");
        int n = scanner.nextInt();
        scanner.close();
        StdDraw.line(0.5 + 0.1, 0.3 + Math.sqrt(0.3), 0.5 + 0, 0.5 + 0);
        StdDraw.line(0.5 + 0, 0.5 + 0, 0.5 + 0.2, 0.5 + 0);
        StdDraw.line(0.5 + 0.2, 0.5 + 0, 0.5 + 0.1, 0.3 + Math.sqrt(0.3));
        draw(n, 0.5 + 0.1, 0.3 + Math.sqrt(0.3), 0.5 + 0, 0.5 + 0, 0.5 + 0.2, 0.5 + 0);
        
    }
     
    public static void draw(int n, double x0, double y0, double x1, double y1, double x2, double y2){
        if (n == 0) return;
        double x0x1_mid = (x0 + x1) / 2;
        double y0y1_mid = (y0 + y1) / 2;
        double x1x2_mid = (x1 + x2) / 2;
        double y1y2_mid = (y1 + y2) / 2;
        double x2x0_mid = (x2 + x0) / 2;
        double y2y0_mid = (y2 + y0) / 2;
        StdDraw.line(x0x1_mid, y0y1_mid, x1x2_mid, y1y2_mid);
        StdDraw.line(x1x2_mid, y1y2_mid, x2x0_mid, y2y0_mid);
        StdDraw.line(x2x0_mid, y2y0_mid, x0x1_mid, y0y1_mid);
     // StdDraw.pause(500); // delay for animation
        draw(n-1, x0x1_mid, y0y1_mid, x1, y1, x1x2_mid, y1y2_mid);  // draw set of gaskets on left triangle
        draw(n-1, x2x0_mid, y2y0_mid, x1x2_mid, y1y2_mid, x2, y2);  // draw set of gaskets on right triangle
        draw(n-1, x0, y0, x0x1_mid, y0y1_mid, x2x0_mid, y2y0_mid);  // draw set of gaskets on upper triangle
    }
}
