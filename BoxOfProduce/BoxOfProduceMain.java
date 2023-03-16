import java.io.*;
import java.util.*;
 
public class BoxOfProduceMain{
 
    public static void main(String[] args){
        System.out.println("There are five items this week: ");
            BoxOfProduce box = new BoxOfProduce("produce.txt");
            try{
            File text = new File("produce.txt");
            Scanner sc = new Scanner(text);
            
            for (int i = 0; sc.hasNextLine(); i++)
            {
                String line = sc.nextLine();
                System.out.print(line + "\n");
            }
            sc.close();
        } catch(FileNotFoundException e)
        {
 
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Your box contains: " + "\n" + box.getFirstChoice() + "\n" + box.getSecondChoice() + "\n" + box.getThirdChoice());
        System.out.println("Would you like to make a substitution(y/n)?");
        char input = sc.nextLine().charAt(0);
        if (input == 'y')
        {
            System.out.println("What item would you like to substitute?");
            String olditem = sc.nextLine();
            System.out.println("What item would you like to replace it with?");
            String newitem = sc.nextLine();
            box.replace(olditem, newitem);
            System.out.println("Here is your new order: ");
            System.out.println(box.getFirstChoice() + "\n" + box.getSecondChoice() + "\n" + box.getThirdChoice());
        }   
        sc.close();
 
 
    }
}
