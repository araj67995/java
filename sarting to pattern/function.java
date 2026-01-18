import java.util.*;

public class function{
    public static void product(int a, int b){
        int product = a * b;

        System.out.print(product);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        product(a, b);
    }
}