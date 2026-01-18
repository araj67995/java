public class search2D {
    // search in sorted matix
    public static int search(int arr[][], int key){
        int i = 0;
        int j = arr[0].length-1;
        
        while(i < arr.length && j >= 0){
            // greater
            if(arr[i][j] > key){
                j--;
            }
            // smaller
            if(arr[i][j] < key){
                i++;
            }
            if(arr[i][j] == key){
                return 1;
            }
        }
        return 0;
    }
    public static void main (String[] args){
        int arr[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {20, 30, 40, 50}, {25, 35, 45, 55}};

        System.out.print(search(arr, 25));
    }
}
