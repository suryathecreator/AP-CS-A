import java.util.Scanner;
 
public class StudentGrader{
  
     public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Quiz 1 is: ");
        int quiz1 = Integer.parseInt(scanner.next());
        System.out.println("Quiz 2 is: ");
        int quiz2 = Integer.parseInt(scanner.next());
        System.out.println("Quiz 3 is: ");
        int quiz3 = Integer.parseInt(scanner.next());
        System.out.println("Midterm is: ");
        int midterm = Integer.parseInt(scanner.next());
        System.out.println("Final Exam is: ");
        int finalExam = Integer.parseInt(scanner.next());
        scanner.close();
        StudentRecord grader = new StudentRecord(name, quiz1, quiz2, quiz3, midterm, finalExam);
        grader.toString(); 
    }
  
  
  }