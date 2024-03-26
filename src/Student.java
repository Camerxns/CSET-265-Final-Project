public class Student{
    private int ID; //Represents a Student's ID
    private String name; //Represents a Student's Name
    private int age; //Represents a Student's Age
    private int grade; //Represents the grade the Student is in
    public Student(int studentID, String studentName, int studentAge, int studentGrade){ //This constructor allows for the creation of a Student for the StudentManagementSystem.java file.
        this.ID = studentID;
        this.name = studentName;
        this.age = studentAge;
        this.grade = studentGrade;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getGrade() {
        return grade;
    }
    public int getID() {
        return ID;
    }
    public void readStudent(){
        System.out.println("Student ID: " + this.getID());
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Age: " + this.getAge());
        System.out.println("Student Grade: " + this.getGrade());
    }
}