import java.util.*;
public class SortAlgorithms {
    Scanner scan = new Scanner(System.in);

//    This is going to help us sort by alphabetical order. Written By Cam
public void bubbleSort(LinkedList<Student> list) {
    int n = list.size();

    for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (list.get(j).getName().compareTo(list.get(j + 1).getName()) > 0) {
                Student temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}


    //Written by Connor. Helps with quickSort() by returning an integer for quickSort.
    public int partition(LinkedList<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getName().compareTo(pivot.getName()) < 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);
        return (i + 1);
    }
    // Written by Connor. Sorts by ID.
    public void quickSort(LinkedList<Student> students, int low, int high){
        if(low < high){
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }
}
