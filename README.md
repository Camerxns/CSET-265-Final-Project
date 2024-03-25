    public void deleteStudent(){ //Deletes a student from the system by providing an ID.
        try{
//            File tempFile = new File("tempFile.txt");
BufferedReader reader = new BufferedReader(new FileReader("Students.txt"));
FileWriter writer = new FileWriter("Students.txt", true);

            String line = reader.readLine();

            System.out.print("Student ID to be removed from the database: ");
            int selectedID = scan.nextInt();
            while(true){
                line = reader.readLine();
                if(String.valueOf(selectedID) == line){
                    writer.write("");
                }
//                writer.write(reader.readLine());
}
}catch (IOException e){
e.printStackTrace();
}

    }