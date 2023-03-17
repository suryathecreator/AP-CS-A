import java.util.*;

public class Mode 
{
    public static void mode(int[] arr)
    {
        HashMap<Integer, Integer> modes = new HashMap<>(); // Hashmap to hold multiple modes in case there is.

        int lastModeFreq = 1, currnum;
        Arrays.sort(arr, 0, arr.length); // Sorting input array; no return from this function, it modifies the input array directly.
        System.out.println("This is the array after sorting: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 1; i < arr.length; i++) // Going through the sorted array.
        {
            currnum = arr[i];
            while (arr[i] == arr[i-1]) // Mode detected.
            {
                lastModeFreq++; // Increasing freq.
                if (i == (arr.length - 1)) // When we are at the last element; edge case.
                {
                    break;
                }
                i++;// Going to next entry in case this same mode has a higher frequency.
            }
            modes.put(currnum, lastModeFreq); // Adding the mode as the key, and the freq as the value.
            lastModeFreq = 1; // Resetting lastModeFreq for the next possible mode.
        }
        int maxValueInMap = (Collections.max(modes.values())); // Finding the highest freq in the hashmap of modes with their respective frequencies.
        System.out.println("Frequency is: " + maxValueInMap); // Even if there are multiple modes, they will all have the same frequency.
        System.out.print("Modes are: ");
        for (Map.Entry<Integer, Integer> entry : modes.entrySet()) // Traversing through hashmap to find which modes have the highest frequency found to display that number.
        {
            if (entry.getValue() == maxValueInMap)
            {
                System.out.print(entry.getKey() + " "); // Printing the modes with the highest frequency.
            }
        }
        System.out.println(" "); // Note: We go through the hashmap drama mostly since we could have multiple modes with the same (highest) frequency.
    }
    public static void main(String args[])
    {
        int[] arr = new int[100];
        Random rand = new Random();
        System.out.println("This is the array before sorting: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = 1 + rand.nextInt(365);
            System.out.print(i + " ");
        }
        System.out.println(" ");
        mode(arr); // Passing input array into mode function.
    }
}
