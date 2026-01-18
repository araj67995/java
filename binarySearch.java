import java.util.*;

public class binarySearch {
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (end + start) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid +1;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        System.out.print(binarySearch(numbers, 6));
    }
}
