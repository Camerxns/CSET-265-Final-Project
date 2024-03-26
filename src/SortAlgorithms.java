import java.util.*;
public class SortAlgorithms {
    Scanner scan = new Scanner(System.in);

//    This is going to help us sort by alphabetical, or numerical order. Written By Cam
    public void bubbleSort(LinkedList<Integer> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
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

    public void insertSort(){
        System.out.println("Enter a Number:\n1.) ID\n2.) Name\n3.) Age\n4.) Grade");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
    public void quickSort(){
        System.out.println("Enter a Number:\n1.) ID\n2.) Name\n3.) Age\n4.) Grade");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
