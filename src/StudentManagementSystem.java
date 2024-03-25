import java.io.*;
import java.util.Scanner;

public class StudentManagementSystem {

    private File file; //Wirtten by cam
    Scanner scan = new Scanner(System.in);

//    Wirtten by Cam
    public StudentManagementSystem(String filename) {
        this.file = new File(filename);
        createFileIfNotExists(); // This will create the file if the file does not exist
    }

//    I created this function as a way to verify where the txt file should go as when I had the txt file in the src
//    folder it was returning that the file did not exist. You can also use this to create new txt files for different lists. Written By Cam
    private void createFileIfNotExists() {
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("Failed to create the file.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }


//    This function was created in order to read the file and display data back to the user. Written By Cam
    public void readFile() {
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

//    This function was created to write to the txt file to store whatever content someone wanted to in here. Written By Cam
    public void writeFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(content);
            writer.newLine();
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public void addStudent(){ //WIP, allows to add a Student in the database. Written By Connor, Cam helped with figuring out funtionality
        try{
            FileWriter writer = new FileWriter("Students.txt", true);

            System.out.print("Enter a Student ID: ");
            int studentID = scan.nextInt();
            System.out.print("Enter the Student's Name: ");
            String studentName = scan.next();
            System.out.print("Enter the Student's Age: ");
            int studentAge = scan.nextInt();
            System.out.print("Enter the Student's Grade: ");
            int studentGrade = scan.nextInt();

            writer.write(String.valueOf(studentID + " "));
            writer.write(studentName + " ");
            writer.write(String.valueOf(studentAge) + " ");
            writer.write(String.valueOf(studentGrade) + " ");
            writer.write(System.getProperty("line.separator"));
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println("Error, failed somehow");
            e.printStackTrace();
        }
    }

    public void deleteStudent(){ //Deletes a student from the system by providing an ID.
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Students.txt"));
            FileWriter writer = new FileWriter("Students.txt", true);
            String line = reader.readLine();

            System.out.print("Student ID to be removed from the database: ");
            int selectedID = scan.nextInt();

            System.out.println(line);
            if(String.valueOf(selectedID) == line){
                writer.append("");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void showAllStudents(){
        try{
            BufferedReader reader = new BufferedReader (new FileReader("Students.txt"));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
