import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // if (a < 0) {
        //     System.out.print("Enter postivie number");

        // } else if (a % 2 == 0) {
        //     System.out.print("Even");
        // } else {
        //     System.out.print("Odd");
        // }

        // String result = (a > 33)?"pass": "fail";
        // System.out.print(result);

        switch (a) {
            case 1: 
            System.out.print("Monday");
            break;

            case 2: 
            System.out.print("Tuesday");
            break;

            case 3: 
            System.out.print("Wednesday");
            break;

            case 4: 
            System.out.print("Thrusday");
            break;

            case 5: 
            System.out.print("friday");
            break;

            case 6: 
            System.out.print("Saturday");
            break;

            case 7: 
            System.out.print("Sunday");
            break;

            default:
            System.out.print("Enter Valid day");
            break;
        }
    }
}
