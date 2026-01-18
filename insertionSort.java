public class insertionSort {

    public static void insertionShort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            while (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i != 0) {
                    i--;
                }
            }
        }
    }

    public static void decending(int arr[]){
        for (int i = arr.length - 1; i > 0; i--) {
            while (arr[i] > arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                if (i != arr.length-1) {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -9, 3, 4, 7, 5, 6, 1 };
        decending(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
