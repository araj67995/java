public class sortedArr {
    public static boolean sorted(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
         return sorted(arr, i+1);
    }

    public static boolean sort(int arr[], int i){
        if(i == 0){
            return true;
        }
        if(arr[i] < arr[i-1]){
            return false;
        }

        return sort(arr, i - 1);
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 5, 6, 9,  10};
        System.out.println(sort(arr, arr.length -1));
    }
}
