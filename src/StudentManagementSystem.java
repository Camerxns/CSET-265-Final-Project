import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class StudentManagementSystem {
    private File file; //Wirtten by cam
    public LinkedList<Student> students = new LinkedList<Student>();
    Scanner scan = new Scanner(System.in);
    public void searchStudent(){ //Allows to search for a Student. Created by Connor
        System.out.println("Type 1 to Search by ID,\nType 2 to Search by Name.");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.print("Please Enter The Student's ID You Wish To Search: ");
                int ID = scan.nextInt();
                for (int i = 0; i < this.students.size(); i++) {
                    if(this.students.get(i).getID() == ID){
                        System.out.println("Student found:");
                        this.students.get(i).readStudent();
                        return;
                    }
                }
                System.out.println("Student not found, by ID: " + ID);
                return;
            case 2:
                System.out.print("Please Enter The Student's Name You Wish To Search: ");
                scan.nextLine();
                String searchTarget = scan.nextLine();
                for(int i = 0; i < this.students.size(); i++){
                    if(this.students.get(i).getName().equals(searchTarget)){
                        System.out.println("Student found:");
                        this.students.get(i).readStudent();
                        return;
                    }
                }
                System.out.println("Student not found, by Name: " + searchTarget);
        }
    }
    public void studentGenerator(){ //Written by Connor. Generates random students
        Random random = new Random();
        String[] firstNames = {
                "John", "Jane", "Cameron", "Connor",
                "Fahim", "Carlos", "Ada", "Leon",
                "Chris ", "Jill ", "Claire", "Albert",
                "Ashley ", "Ichigo", "Rukia", "Grimmjow",
                "Bambietta", "Gremmy ", "Tier", "Nelliel",
                "Ethan", "Ava", "Liam", "Isabella",
                "Noah", "Sophia", "Mason", "Mia",
                "Benjamin", "Charlotte", "Elijah", "Amelia",
                "Oliver", "Harper", "James", "Evelyn",
                "Alexander", "Abigail", "William", "Sofia",
                "Daniel", "Elizabeth", "Michael", "Emily",
                "Elijah", "Avery", "Matthew", "Grace",
                "Logan", "Scarlett", "Lucas", "Aria",
                "Henry", "Madison", "Jackson", "Chloe",
                "Sebastian", "Ella", "Aiden", "Lily",
                "Gabriel", "Layla", "Carter", "Riley",
                "Wyatt", "Zoe", "Jayden", "Stella",
                "Christopher", "Victoria"
        };
        String[] lastNames = {
                "Doe", "Angelilli", "Hamilton", "Shams",
                "Oliveira", "Wong", "Kennedy", "Redfield",
                "Valentine", "Wesker", "Graham", "Kurosaki",
                "Kuchiki", "Jaegerjaquez", "Basterbine", "Thoumeaux",
                "Harribel", "Tu", "Johnson", "Martinez",
                "Smith", "Brown", "Jones", "Garcia",
                "Miller", "Davis", "Rodriguez", "Jackson",
                "Wilson", "Anderson", "Thomas", "Martin",
                "Taylor", "Hernandez", "Moore", "Thompson",
                "White", "Lopez", "Hall", "Lee",
                "Perez", "Harris", "Clark", "Allen"
        };

        Student[] studentsArr = new Student[20];
        for(int i = 0; i < studentsArr.length; i++){
            int id = i + 1;
            String name = firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(lastNames.length)];
            int age = random.nextInt(15) + 5;
            int grade = random.nextInt(13);

            studentsArr[i] = new Student(id, name, age, grade);
            this.students.add(studentsArr[i]);
        }
    }
    public void addStudent(){ //Allows to add a Student in the database. Written By Connor, Cam helped with figuring out funtionality
            System.out.print("Enter a Student ID: ");
            int studentID = scan.nextInt();
            for(int i = 0; i < this.students.size(); i++){
                if(this.students.get(i).getID() == studentID){
                    System.out.println("Duplicate ID already exists.");
                    return;
                }
            }
            System.out.print("Enter the Student's Name: ");
            scan.nextLine();
            String studentName = scan.nextLine();
            System.out.print("Enter the Student's Age: ");
            int studentAge = scan.nextInt();
            System.out.print("Enter the Student's Grade: ");
            int studentGrade = scan.nextInt();
            if(studentGrade < 0 && studentGrade > 12){
                System.out.println("Error. Student's grade not valid.");
                return;
            }
            this.students.add(new Student(studentID, studentName, studentAge, studentGrade));
    }
    public void deleteStudent() { //Deletes a student from the system by providing an ID, Name, and Grade. Written by Connor
        System.out.println("Type 1 - Delete by ID\nType 2 - Delete by Name\nType 3 - Delete by Grade");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Type a Student's ID: ");
                int targetID = scan.nextInt();
                for (int i = 0; i < this.students.size(); i++) {
                    if (this.students.get(i).getID() == targetID) {
                        this.students.remove(i);
                        return;
                    }
                }
                System.out.print("Student not found by ID: " + targetID);
                return;
            case 2:
                System.out.print("Type a Student's Name: ");
                scan.nextLine();
                String targetName = scan.nextLine();
                for (int i = 0; i < this.students.size(); i++) {
                    if (this.students.get(i).getName().equals(targetName)) {
                        this.students.remove(i);
                        return;
                    }
                }
            case 3:
                System.out.print("Type a Student's Grade: ");
                int targetGrade = scan.nextInt();
                if (targetGrade < 0 && targetGrade > 12) {
                    System.out.print("Grade invalid. Please input a grade between 0-12.");
                    return;
                }
                for (int i = 0; i < this.students.size(); i++) {
                    if (this.students.get(i).getGrade() == targetGrade) {
                        this.students.remove(i);
                    }
                }
                System.out.println("All Students are Removed from Grade " + targetGrade);
        }
    }

    public void showAllStudents(){ //Created by Connor
        for (int i = 0; i < this.students.size(); i++) {
            if(i % 4 == 0){
                System.out.print("\n");
            }
            if(i + 1 >= students.size()){
                System.out.print(this.students.get(i).getName());
            }else{
                System.out.print(this.students.get(i).getName() + ", ");
            }
        }
    }
}
