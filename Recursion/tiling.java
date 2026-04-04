public class tiling {
    public static int tilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // verticle
        int v = tilingWays(n - 1);

        // horizantal
        int h = tilingWays(n - 2);

        return v + h;
    }

    public static void main(String[] args) {
        System.out.println(tilingWays(4));
    }
}
