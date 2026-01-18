public class maxSumIII {
    // Kadanes method
    public static void kadanes(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];

            if(curSum < 0){
                curSum = 0;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        System.out.print(maxSum);
    }

    public static void main(String[] args){
        int arr[] = {-2, 3, 5, -5, -7, 3, -6, 7, 3};

        kadanes(arr);
    }
}
