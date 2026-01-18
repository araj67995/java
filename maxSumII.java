public class maxSumII {
    // using prefix sum (method 2)
    public static void sumSubarr(int arr[]){
        int prefixSum[] = new int[arr.length];
        int sum = 0;
        int MaxSum = 0;

        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr.length; j++){
              sum = i == 0? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

              if(MaxSum < sum){
                MaxSum = sum;
              }
            }
        }

        System.out.println(MaxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -4, 5, 6, -7 };
        sumSubarr(arr);
    }
}
