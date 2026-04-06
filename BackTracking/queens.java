public class queens {
    // is Safe
    public static boolean isSafe(String chess[][], int row, int col) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (chess[i][col] == "Q") {
                return false;
            }
        }

        // left digonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == "Q") {
                return false;
            }
        }

        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == "Q") {
                return false;
            }
        }

        return true;
    }

    // Put queens
    public static void nQueens(String chess[][], int row) {
        // base
        if (row == chess.length) {
            printChess(chess);
            count++;
            return;
                // position
        for (int i = 0; i < chess.length; i++) {
            if (isSafe(chess, row, i)) {
                chess[row][i] = "Q";
                nQueens(chess, row + 1);
                chess[row][i] = "X";
            } 
        }
    }

    // Print chess
    public static void printChess(String chess[][]) {
        System.out.println("------------------------");
        int n = chess.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        String chess[][] = new String[n][n];

        // intialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = "X";
            }
        }

        nQueens(chess, 0);
        System.out.print("no. of ways" + count);
    }
}0