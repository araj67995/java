import java.util.*;

public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int oddSum = 0, evenSum = 0;
        int choice = 0;

        do{
            i = sc.nextInt();

            if(i % 2 == 0){
                evenSum += i;
            } else if(i % 2 == 1){
                oddSum += i;
            }

            System.out.print("Do you want to continoue, 1 for Yes or 0 for No");
            choice = sc.nextInt();
        }while (choice == 1);

        System.out.println("Odd Sum = " +oddSum);
        System.out.println("Even Sum = " +evenSum);
    }
}
