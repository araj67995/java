public class pair {
    public static void pair(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( i >= j){
                    continue;
                }
                System.out.print("("+ arr[i]+ ", "+ arr[j]+ ") ");
            }
            System.out.print("\n");
        }
    }
     public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        
        pair(arr);
    }
}
