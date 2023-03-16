/**
 * Which is more likely: at least one 6 in 6 rolls of a fair die,
 * or at least two 6's in 12 rolls of a fair die?
 * DO NOT solve this as a math problem (you can of course). This is a computation
 * problem. Estimate the probabilities through simulation. If you simply return the 
 * theoretical/analytical probability calculated mathematically, you will not pass 
 * the test cases.
 * 
 */
public class Pepys
{
    /**  
     * @param n the number of simulations (experiments) to run
     * (A simulation is rolling a die 6 times.)
     * @return the estimated likelihood of rolling at least one 6 in 6 rolls of a fair die
     */
    public double probAtLeastOneSix(int n){
        int countSix = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if ((int)(((Math.random()) * 6) + 1) == 6)
                {
                    countSix++;
                    break;
                }
            }
        }
        return (double)countSix/n;
    }
    
     /**
     * @param n the number of simulations (experiments) to run
     * (A simulation is rolling a die 12 times.)
     * @return the estimated likelihood of rolling at least two 6's in 12 rolls of a fair die
     */
    public double probAtLeastTwoSixes(int n){
        int countTwelve = 0;
        int internalCountTwelve = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                if ((int)(((Math.random()) * 6) + 1) == 6)
                {
                    internalCountTwelve++;
                    if (internalCountTwelve == 2)
                    {
                        countTwelve++;
                        break;
                    }
                }
            }
            internalCountTwelve = 0;
        }
        return (double)countTwelve/n;
    }
 
}
 
  
        
            
            