import java.util.*;

class InventoryItem implements Comparable<InventoryItem>
{
    private String name;
    private int uniqueItemID;

    public int compareTo(InventoryItem second)
    {
        if (this.getUniqueItemID() > second.getUniqueItemID())
        {
            return 1;
        }
        else if (this.getUniqueItemID() == second.getUniqueItemID())
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    public InventoryItem(String newName)
    {
        this.name = newName;
    }
    public InventoryItem(int newUniqueItemID)
    {
        this.uniqueItemID = newUniqueItemID;
    }
    public InventoryItem (String newName, int newUniqueItemID)
    {
        this.name = newName;
        this.uniqueItemID = newUniqueItemID;
    }
    public String getName()
    {
        return this.name;
    }
    public int getUniqueItemID()
    {
        return this.uniqueItemID;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public void setUniqueItemID(int newUniqueNameID)
    {
        this.uniqueItemID = newUniqueNameID;
    }
    public static void main(String args[])
    {
        InventoryItem[] tester = new InventoryItem[3];
        tester[0] = new InventoryItem("Hot Cheetos", 335);
        tester[1] = new InventoryItem("Skittles", 921);
        tester[2] = new InventoryItem("Ramen", 556);
        System.out.println("The objects before sorting are: ");
        System.out.println(tester[0].getName() + " -> " + tester[0].getUniqueItemID());
        System.out.println(tester[1].getName() + " -> " + tester[1].getUniqueItemID());
        System.out.println(tester[2].getName() + " -> " + tester[2].getUniqueItemID());
        Arrays.sort(tester); // Problem description states that the array should have been of type Comparable but I think it was a typo.
        System.out.println("The objects after sorting are: ");
        System.out.println(tester[0].getName() + " -> " + tester[0].getUniqueItemID());
        System.out.println(tester[1].getName() + " -> " + tester[1].getUniqueItemID());
        System.out.println(tester[2].getName() + " -> " + tester[2].getUniqueItemID());
    }
}