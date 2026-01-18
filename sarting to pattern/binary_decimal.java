public class binary_decimal {
    public static void binarydecimal(int a) {
        int pow = 0;
        int decimal = 0;

        while (a > 0) {
            int lastDigit = a % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            a = a / 10;
        }

        System.out.println(decimal);
    }

    public static void main(String[] args) {
        binarydecimal(101);
    }

}
