import java.util.*;

public class Nnum {
    public static void main(String args[]) {   
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers, N: ");
        do {
            try {
                N = Integer.valueOf(scanner.nextLine());
                if ((N <= 0))
                {
                    throw new Exception("Exception: N greater than 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.print("Enter a positive value for N: ");
            }
        }
        while (true);
        int[] numbers = new int[N];
        int currentNum;
            for (int i = 0; i < N; i++) {
                System.out.print("Enter element number " + (i + 1) + ": ");
                do {
                    try {
                        currentNum = Integer.valueOf(scanner.nextLine());
                        if (!(currentNum >= 0) && !(currentNum < 0))
                        {
                            throw new Exception("Exception: input must be an integer!");
                        }
                        numbers[i] = currentNum;
                        break;
                    } catch (Exception e2) {
                        System.out.println(e2.getMessage());
                        System.out.print("Enter a valid input: ");
                    }
                }
                while (true);
            }
            scanner.close();
            int sum = 0;
            for (int i = 0; i < numbers.length; i++)
            {
                sum += numbers[i];
            }
            System.out.println("The average of the numbers is: " + (((double) sum) / numbers.length));
        }
        
}

