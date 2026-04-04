public class qI {
    public static void print(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    // merge sort
    public static void mergeSort(String arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        mergeSort(arr, si, mid); // left
        mergeSort(arr, mid+1, ei); // right
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int start, int mid, int end){
       
    }

    public static void main(String[] args){
       String arr[] = {"map", "ear", "moon", "cat"};
       print(arr);
    }
}
