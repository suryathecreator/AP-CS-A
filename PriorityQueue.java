import java.util.ArrayList;

/**
 * This program implements a priority queue capable of 
 * holding objects of an arbitrary type, T, by defining 
 * a PriorityQueue class that implements the queue with an ArrayList. 
 * A priority queue is a type of list where every item added to the 
 * queue also has an associated priority.
 *
 * @author Surya Duraivenkatesh
 * @version 11/17/2022
 */

public class PriorityQueue<T>{
    private ArrayList<T> items;
    private ArrayList<Integer> priorities;

    public PriorityQueue(){ 
        items = new ArrayList<T>();
        priorities = new ArrayList<Integer>();   
    }
    
    public void add(T item, int priority){
        items.add(item);
        priorities.add((Integer)priority);
    }
    
    public T remove(){
        int highestNum = Integer.MIN_VALUE, highestIndex = Integer.MIN_VALUE;
        T highestItem;

        if (items.size() != 0){
            for (int i = 0; i < priorities.size(); i++)
            {
                if (priorities.get(i).intValue() > highestNum)
                {
                    highestNum = priorities.get(i).intValue();
                    highestIndex = i;
                }
            }
            highestItem = items.get(highestIndex);
            items.remove(highestIndex);
            priorities.remove(highestIndex);

            return highestItem;
        }
        else
            return null;
    }

    public String toString(){
        String converted;
        converted = "[ ";

        for (int i = 0; i < priorities.size(); i++)
        {
            converted += "[" + items.get(i) + "," + priorities.get(i) + "]";
            if (i != priorities.size() - 1)
            {
                converted += ", ";
            }
        }
        converted +=" ]";

        return converted;
    }
    
    /*
     * Some test code.
     */
    public static void main(String[] args){
        /*
        The output should look like this:
        
        [ [X,4], [Z,7], [Y,10], [Y,10], [Z,7] ]
        [ [X,4], [Z,7], [Y,10], [Z,7] ]
        [ [X,4], [Z,7], [Z,7] ]
        [ [X,4], [Z,7] ]
        [ [X,4], [Z,7], [A,5], [B,8] ]
        [ [X,4], [Z,7], [A,5] ]
        [ [X,4], [A,5] ]
        
        */
    
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("X", 4);
        queue.add("Z", 7);
        queue.add("Y", 10);
        queue.add("Y", 10);
        queue.add("Z", 7);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add("A", 5);
        queue.add("B", 8);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}