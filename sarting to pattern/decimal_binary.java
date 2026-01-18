import java.util.*;
public class decimal_binary {
    public static void decimalbinary(int a){
        int reminder = 0;
        int binary = 0;
        int pow = 0;

        while(a > 0){
            reminder = a % 2;
            binary = binary + reminder*(int)Math.pow(10, pow);
            pow++;
            a = a / 2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        decimalbinary(sc.nextInt());
    }
}
