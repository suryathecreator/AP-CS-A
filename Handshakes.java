import java.util.Scanner;

public class Handshakes 
{
    public static int handshake(int n)
    {
        // base case
        if (n == 1)
        {
            return 0;
        }
        return (n - 1) + handshake(n - 1);
    }

    public static void main(String args[])
    {
        int numberOfPeople;
        Scanner input = new Scanner(System.in);
        System.out.print("How many people are in the room? ");
        numberOfPeople = Integer.valueOf(input.nextLine());
        input.close();
        System.out.println("The amount of handshakes that occured in the aforementioned room is: " + handshake(numberOfPeople));
    }



}