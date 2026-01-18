import java.util.*;
public class binomial {
    public static int factorial(int a){
        int factorial = 1;
        for(int i = 1; i<=a; i++){
            factorial *= i;
        }

        return factorial;
    }
    public static int binomialcofficent(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = n - r;
        int d = factorial(c);

        int binomial = a / (b*d);
        return binomial;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int binomialcoff = binomialcofficent(n, r);
        System.out.print("binomial cofficent is " + binomialcoff);
    }
}
