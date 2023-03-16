import java.util.Scanner;

public class JumpIt 
{
    public static int jump(int input[])
    {
        int size = input.length;
        int index = 0, totalCost = 0, cost1 = 0, cost2 = 0;
        return jumpIt(input, size, index, totalCost, cost1, cost2);
    }
    private static int jumpIt(int input[], int size, int index, int totalCost, int cost1, int cost2)
    {
        // base case
        if (index == (size - 1))
        {
            return totalCost;
        }
        // base case 2
        else if (index == (size - 2))
        {
            return totalCost + input[index + 1];
        }
        else
        {
            cost1 = jumpIt(input, size, index + 1, totalCost + input[index + 1], 0, 0);
            cost2 = jumpIt(input, size, index + 2, totalCost + input[index + 2], 0, 0);
            if (cost1 > cost2)
            {
                return cost2;
            }
            else
            {
                return cost1;
            }
        }
        // ATTEMPT 1:
        /* 
        // base case 1
        if (index == (size - 1))
        {
            return totalCost;
        }
        // base case 2
        else if (index == (size - 2))
        {
            return totalCost + input[size - 1];
        }
        else
        {
            if (input[index + 1] > input[index + 2])
            {
                return jumpIt(input, size, index + 2, totalCost + input[index + 2]);
            }
            else
            {
            return jumpIt(input, size, index++, totalCost + input[index + 1]);
            }
        }
        */
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int size = Integer.valueOf(scanner.nextLine());
        int[] input = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.print("Please enter array element " + i + ": ");
            input[i] = Integer.valueOf(scanner.nextLine());
        }
        scanner.close();
        System.out.println("The lowest cost is: " + jump(input));
    }
}
