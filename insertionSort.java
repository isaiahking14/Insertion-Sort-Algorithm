import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class insertionSort {
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        load();
        insertionSorted(arr);
    }
    
    private static void load() throws FileNotFoundException {
        File number = new File("numbers-1.txt");
        Scanner scan = new Scanner(number);
        int index_count = 0;
        while (scan.hasNextInt()){
            index_count++;
            scan.nextInt();
        }
        arr = new int[index_count];
        scan.close();
        Scanner scan2 = new Scanner(number);
        index_count = -1;
        while (scan2.hasNextInt()){
            index_count++;
            arr[index_count] = scan2.nextInt();
        }
        scan2.close();
    }

    private static void insertionSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                for (int j = i; j > 0; j--) {
                    if (arr[j] < arr[j - 1]){
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

}