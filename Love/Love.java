 
/**
 * Here, we change the first occurrence of "hate" to "love".
 * The input is any string.
 * The output is the string with the first occurrence of "hate" changed to "love".
 * 
 * @author Surya Duraivenkatesh
 * @version 09/11/2022
 */
public class Love
{
    
    /**
     * Takes a String and replaces the first occurrence of "hate" with "love". 
     * If the word "hate" does not appear in the String, this method returns
     * the original String.
     * If the word "hate" occurs more than once in the String, 
     * this method replaces only the first occurrence of "hate".
     * 
     * Note: you can only use the indexOf and substring methods. You will not get
     * credit if you use any of the other String methods such as replace()
     */
    public String loveNotHate(String str){
        int index = str.indexOf("hate");
        if(index == -1)
        {
            return str;
        }
        return str.substring(0, index) + "love" + str.substring(index + 4);
    }
}