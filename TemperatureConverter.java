 
/**
 * In this program, I will convert Fahrenheit temperatures to Celsius temperatures.
 * 
 * @author Surya Duraivenkatesh
 * @version 09/03/2022
 */
public class TemperatureConverter
{
    
   /**
    * converts fahrenheit to celsius
    * 
    * @param fhar the temperature in fahrenheit
    * @return the temperature in degrees celsius
    */ 
   public double fToC(double fahr){
    double celsius = ((fahr-32) * (5.0/9));
    return celsius;
   }
       
       
}