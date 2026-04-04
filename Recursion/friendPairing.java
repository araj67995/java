public class friendPairing {
    public static int totalWays(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int single = totalWays(n - 1);
        int pair = totalWays(n - 2);
        int pairWays = (n - 1) * pair;

        return single + pairWays;
    }

    // Binary String
    public static void binaryString(int n, int lastDigit, String str) {
        if (n == 0) {
            System.out.println(str + " ");
            return;
        }

        binaryString(n - 1, 0, str+"0");
        if (lastDigit == 0) {
            binaryString(n - 1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        binaryString(3, 0, "");
    }
}
