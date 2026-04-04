public class firstOccur {
    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i + 1, key);
    }

    public static int lastOccur(int arr[], int i, int key){
        if (i<0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return lastOccur(arr, i - 1, key);
    }
    public static void main(String[] args){
        int arr[] = {15, 56, 23, 40, 41, 26, 34, 41, 78, 64, 52};
        System.out.println(firstOccur(arr, 0, 52));
        System.out.println(lastOccur(arr, arr.length -1, 41));
    }
}
