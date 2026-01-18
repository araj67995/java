public class bitWise {
    // Odd and Even
    public static String check(int a) {
        if ((a & 1) == 0) {
            return "Even";
        }
        return "Odd";
    }

    // Get ith bit
    public static void get(int a, int i) {
        if ((a & (1 << i)) == 0) {
            System.out.println(0);
        } else
            System.out.println(1);
    }

    // Set ith bit
    public static void set(int a, int i) {
        System.out.println(a | (1 << i));
    }

    // Clear ith bit
    public static void clear(int a, int i) {
        int b = ~(1 << i);
        a = a & b;

        System.out.print(a);
    }

    // update ith bit
    public static void update(int a, int i, int n) {
        if (n == 0) {
            a = a & (~(1 << i));

        } else {
            a = a | (1 << i);
        }
        System.out.println(a);
    }

    // clear last bit
    public static void clearLast(int a, int i) {
        System.out.print(a & ((~0) << i));
    }

    // clear specific bits [~0 = 1111100000]
    public static void clearBits(int a, int i, int j) {
        int b = (~0) << j + 1;
        int c = (1 << i) - 1;
        System.out.print(a & (b | c));
    }

    // check power of 2 [n & n-1] should be zero
    public static void powerOf(int a) {
        if ((a & (a - 1)) == 0)
            System.out.println(a + " is power of 2");
        else
            System.out.println(a + " is not power of 2");
    }

    // count 1 and zero in binary digit
    public static void counter(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    // Bitwise operators
    public static void operators() {
        // AND
        System.out.println(5 & 6);

        // OR
        System.out.println(5 | 6);

        // XOR
        System.out.println(5 ^ 6);

        // complement
        System.out.println(~5);

        // left sift [n * 2^l]
        System.out.println(5 << 2);

        // right sift [n / 2^l]
        System.out.println(6 >> 1);
    }

    // fast exponential
    public static void fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }

        System.out.println(ans);
    }

    // swap the number without third variable
    public static void swap() {
        int a = 3;
        int b = 4;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = "+a+ " b = "+b);
    }

    public static void main(String[] args) {
        // operators();
        // System.out.println(check(11));
        // get(2,1);
        // set(10, 2);
        // clear(10, 1);
        // update(10, 2, 1);
        // clearLast(15, 2);
        // clearBits(15, 1, 2);
        // powerOf(55524);
        // counter(7);
        //fastExpo(5, 3);
        // swap();

        // add +1 to  a digit
        int x = 1;
        System.out.println(-~x);
    }
}
