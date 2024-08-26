import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scan = new Scanner(System.in);

        sms.studentGenerator();

        runMenu(sms, scan);
        System.out.println("Goodbye!");
        scan.close();
    }
    public static void runMenu(StudentManagementSystem sms, Scanner scan) {
        SortAlgorithms sorting = new SortAlgorithms();
        System.out.println("\n1. Add Student To Database \n2. Delete Student From Database \n3. Search For Student In Database \n4. Display All Students In Database \n5. Exit");
        System.out.println();
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                sms.addStudent();
                runMenu(sms, scan);
                break;
            case 2:
                sms.deleteStudent();
                runMenu(sms, scan);
                break;
            case 3:
                sms.searchStudent();
                runMenu(sms, scan);
                break;
            case 4:
                System.out.print("Students: ");
                sms.showAllStudents();
                System.out.println();
                System.out.println("Please Select The Option You Would Like \n1. Sort Students By Name \n2. Sort Students By ID \n3. Return to Main Menu");
                int sortingChoice = scan.nextInt();
                switch(sortingChoice){
                    case 1:
                    sorting.bubbleSort(sms.students);
                    System.out.println();
                    sms.showAllStudents();
                    runMenu(sms, scan);
                    case 2:
                        sorting.quickSort(sms.students, 0, sms.students.size() - 1);
                        runMenu(sms,scan);
                    case 3:
                        runMenu(sms,scan);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                runMenu(sms, scan);
        }
    }
}