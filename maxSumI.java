public class maxSumI {
    // max sum of Subarr (Brute form)
    public static void subarr(int arr[]) {
        int sum = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                }
                if (sum < temp) {
                    sum = temp;
                }
            }
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        subarr(arr);
    }
}
