/* 
class Person {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public void changeFirstName(String newfirstname){
        this.firstname = newfirstname;
    }
    public void changeLastName(String newlastname){
        this.lastname = newlastname;
    }
    public void displayDetails() {
        System.out.println("This person's first name is: " + firstname);
        System.out.println("This person's last name is: " + lastname);
    }
}


class Student extends Person {
   private int studentid;
   private String course;
   private String teachername;

   public Student(String firstname, String lastname, int studentid, String course, String teachername) {
    super(firstname, lastname);
    this.studentid = studentid;
    this.course = course;
    this.teachername = teachername;
    }

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
    }
    public int getStudentId() {
        return studentid;
    }
    public String getCourse() {
        return course;
    }
    public String getTeacherName() {
        return teachername;
    }
    public void changeStudentId(int newstudentid){
        this.studentid = newstudentid;
    }
    public void changeCourse(String newcourse){
        this.course = newcourse;
    }
    public void changeTeacherName(String newteachername) {
        this.teachername = newteachername;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("This student's student id is: " + this.studentid);
        System.out.println("This student's course is: " + this.course);
        System.out.println("This student's teacher name is: " + this.teachername);
    }
}

class Teacher extends Person {
    private String subjectname;
    private int salary;
    public Teacher(String firstname, String lastname, String subjectname, int salary) {
        super(firstname, lastname);
        this.subjectname = subjectname;
        this.salary = salary;
    }  
    public Teacher(String firstname, String lastname) {
        super(firstname, lastname);
    }
    public String getSubjectName() {
        return subjectname;
    }
    public int getSalary() {
        return salary;
    }
    public void changeSubjectName(String newsubjectname) {
        this.subjectname = newsubjectname;
    }
    public void changeSalary(int newsalary) {
        this.salary = newsalary;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("This subject's name is: " + subjectname);
        System.out.println("This teacher's yearly salary in USD is: " + salary);
   }  
    public static void main(String[] args) {
        Student student = new Student("Surya", "Duraivenkatesh", 207119, "AP Computer Science A", "Joseph Polacco");
        Student student2 = new Student("Durai", "Balusamy");
        student2.changeStudentId(912034);
        student2.changeCourse("Differential Equations");
        student2.changeTeacherName("Surya Duraivenkatesh");

        System.out.println("----Student-1----------------");
        student.displayDetails();
        System.out.println("----Student-2----------------");
        student2.displayDetails();

        Teacher teacher = new Teacher("Joseph", "Polacco", "Computer Science", 999999999);
        Teacher teacher2 = new Teacher("Surya", "Duraivenkatesh");
        teacher2.changeSubjectName("Mathematics");
        teacher2.changeSalary(1);
        
        System.out.println("----Teacher-1----------------");
        teacher.displayDetails();
        System.out.println("----Teacher-2----------------");
        teacher2.displayDetails();
    }
}
*/