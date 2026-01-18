import java.util.*;

public class inbuiltSort {
    public static void main(String[] args) {
        Integer arr[] = { -9, 3, 4, 7, 5, 6, 1 };

        // sort till the between given val
        Arrays.sort(arr, 0, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // full array sort
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // in reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
