public class selectionSort {
    public static void selectionShort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
               if(arr[minpos]> arr[j]){
                 minpos = j;
               }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void decending(int arr[]){
        for (int i = arr.length- 1; i >= 0; i--) {
            int maxpos = i;
            for (int j = i-1; j >= 0; j--) {
               if(arr[maxpos]> arr[j]){
                 maxpos = j;
               }
            }
            // Swap
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { -9, 3, 4, 7, 5, 6, 1};
        decending(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
