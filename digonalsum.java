public class digonalsum {
    public static int sum(int arr[][]) {

        // method 1
        // int sum = 0;
        // for(int i = 0; i <arr.length; i++){
        // // pd
        // sum+= arr[i][i];
        // // sd
        // if(i != arr.length-1-i)
        // sum+= arr[i][arr.length-i-1];
        // }

        // method 2
        int totalSum =0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == j){
                    totalSum += arr[i][j];
                } else if(i+j == arr.length-1){
                    totalSum += arr[i][j];
                }
            }
        }
        return totalSum;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.print(sum(arr));
    }
}
