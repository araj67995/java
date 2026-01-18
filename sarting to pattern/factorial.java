import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int fact = 1;
        System.out.print("Enter the number ");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            fact *= i;
        }

        System.out.print("Factorial of "+n +" is " +fact);
    }
}