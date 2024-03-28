import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem("Students.txt");
        Scanner scan = new Scanner(System.in);

//        For testing generator
//        sms.studentGenerator();
//        sms.searchStudent();
//        sms.showAllStudents();


        System.out.println("Please Enter A Number Based On What You Would Like To Do!");
        System.out.println("\n1. Add Student To Database \n2. Delete Student From Database \n3. Search For Student In Database \n4. Display All Students In Database \n5. Exit");
        System.out.println();
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                sms.addStudent();
                scan.close();
                break;
            case 2:
                sms.deleteStudent();
                break;
            case 3:
                sms.searchStudent();
                break;
            case 4:
                sms.showAllStudents();
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
        }
        scan.close();
    }
}