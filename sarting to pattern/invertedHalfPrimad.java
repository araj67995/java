import java.util.*;

public class invertedHalfPrimad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int digit = n;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= digit; k++) {
                System.out.print(" " + k + " ");
            }
            System.out.println("\n");
            digit--;
        }
    }
}
