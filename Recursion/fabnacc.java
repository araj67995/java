public class fabnacc {
    public static int fab(int n){
        if(n == 1 ){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        int fab1= fab(n-1);
        int fab2 = fab(n-2);
        return fab1 + fab2;
    }
   public static void main(String[] args){
        System.out.print(fab(5));
   } 
}
