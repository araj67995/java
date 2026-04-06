public class grid {

    public static int totalWay(int i, int j, int m, int n){
        if(i == m-1 && j == n -1){
            return 1;
        } else if(i == m || j == m){
            return 0;
        }

        //  way
        int w1 = totalWay(i+1, j, m, n);
        int w2 = totalWay(i, j+1, m, n);

        return w1 + w2;
    }
    public static void main(String[] args){
         int m = 3, n =3;
         System.out.print(totalWay(0, 0, m, n));
    }
}
