public class rotatedSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static  int search(int arr[], int key, int si, int ei) {
       if(si > ei){
        return -1;
       }

       int mid = (si+ei)/2;
       if(arr[mid] == key){
        return mid;
       }

       // line 1
       if(arr[si] <= arr[mid]){
        // left
          if(arr[si]<= key && key <= arr[mid]){
              return search(arr, key, si, mid);
          }else { // right
             return search(arr, key, mid+1, ei);
          }
       }
    //    line 2
       if(arr[mid+1] < key){
        // right
        if(arr[mid] <= key && key <= arr[ei]){
            return search(arr, key, mid+1, ei)
        } else{
            // left
            return search(arr, key, si, mid-1);
        }
       }
    }

    public static void main(String[] arga) {
        int arr[] = { 5, 6, 7, 8, 2, 3, 4 };
       System.out.print(search(arr,2, 0, arr.length - 1));
       
    }
}
