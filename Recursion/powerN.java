public class powerN {
    public static int power(int x, int n){  // x^n
        if(n == 1){
            return x;
        }
         return x * power(x, n - 1);
    }

    // ptimized way [take less time]
    public static int power2(int x, int n){
        if (n == 1){
            return x;
        }
        if(n % 2 == 0){
            return power2(x, n/2)* power2(x, n/2);
        }else {
             return x* power2(x, n/2)* power2(x, n/2);
        }
    }

    public static void main(String[] args){
        System.out.print(power2(2, 8));
    }
}
