public class quickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int st, int end) {
        if (st >= end) {
            return;
        }

        int midIdx = midFinder(arr, st, end);
        quickSort(arr, st, midIdx-1);
        quickSort(arr, midIdx + 1, end);
    }

    public static int midFinder(int arr[], int st, int end) {
        int value = arr[end];
        int i = st - 1;
        for (int j = st; j < end; j++) {
            if (arr[j] <= value) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = value;
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] arga) {
        int arr[] = { 4, 5, 1, 3, 8, 6, 8, 2 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}