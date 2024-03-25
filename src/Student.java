public class Student{
    private int ID; //Represents a Student's ID
    private String name; //Represents a Student's Name
    private int age; //Represents a Student's Age
    private int grade; //Represents a Student's Grade
    public Student(int studentID, String studentName, int studentAge, int studentGrade){ //This constructor allows for the creation of a Student for the StudentManagementSystem.java file.
        this.ID = studentID;
        this.name = studentName;
        this.age = studentAge;
        this.grade = studentGrade;
    }
}