public class sumZero {
    public static int sumZero(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (i != j && i != k && k != j) {
                        if(arr[i]+ arr[j]+ arr[k] == 0){
                            System.out.print("["+ arr[i]+ ", "+ arr[j]+ ", "+ arr[k]+"]");
                        }
                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args){
        int nums[] ={-1, 0, 1, 2, -1, 4};
        sumZero(nums);
    }
}
