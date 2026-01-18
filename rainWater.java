public class rainWater {
    public static int rainWater(int arr[]) {
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        int level[] = new int[arr.length];
        int end = arr.length - 1;
        int storedWater = 0;

        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
         
        rightMax[end] = arr[end];
        for(int i = end - 1; i >= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for(int i = 0; i < arr.length; i++){
            level[i] = Math.min(rightMax[i], leftMax[i]);
        }

        // total stored water
        for(int i = 0; i < arr.length; i++){
            storedWater += (level[i] - arr[i])* 1;
        }

        return storedWater;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.print(rainWater(arr));
    }
}
