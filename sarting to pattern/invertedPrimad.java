import java.util.*;

public class invertedPrimad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space = n - 1;
        int star = n - space;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= space; k++) {
                System.out.print("   ");
            }
            for (int l = 1; l <= star; l++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
            space--;
            star++;
        }
    }
}
