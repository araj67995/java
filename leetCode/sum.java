public class sum {
    public static void sum(int l1[], int l2[]) {
        int n = l1.length - 1;
        int m = l2.length - 1;
        int[] a;
        int[] b;
        int[] rev_a;
        int[] rev_b;
        
        if (n > m) {
            int temp[] = new int[n + 1];
            for (int i = 0; i <= n; i++) {
               if(i>m){
                temp[i] = 0;
               } else {
                temp[i] = l2[i];
               }
            }
           a = new int[n+1];
             b = new int[n+1];
            for(int i = 0; i <= n; i++){
                a[i] = l1[i];
                b[i] = temp[i];
            }
        } else if (m > n) {
            int temp[] = new int[m + 1];
            for (int i = 0; i <= m; i++) {
               if(i>n){
                temp[i] = 0;
               } else {
                temp[i] = l1[i];
               }
            }

            a = new int[m+1];
            b= new int[m+1];
            for(int i = 0; i <= m; i++){
                a[i] = temp[i];
                b[i] = l2[i];
            }
        } else {
            a = new int[n+1];
            b = new int[n+1];
            for(int i = 0; i <= n; i++){
                a[i] = l1[i];
                b[i] = l2[i];
            }
        }
          
        rev_a = new int[a.length];
        rev_b = new int[b.length];

        // reverse
        for(int i = 0, j = a.length - 1; i < a.length; i++, j--){
            rev_a[i] = a[j];
            rev_b[i] = b[j];
        }

        int result[] = new int[a.length];
        // sum
        int qut = 0;
        for (int i = a.length-1; i >= 0; i--) {
            int sum = rev_a[i] + rev_b[i] + qut;
            int rem = sum % 10;
            qut = sum / 10;
            result[i] = rem;
        }

       // print
if (qut > 0) {
    System.out.print(qut);   // ✅ simple fix
}
for (int i = 0; i < result.length; i++) {
    System.out.print(result[i]);
}

    }

    public static void main(String[] args) {
        int l1[] = {9,9,9,9,9,9,9};
        int l2[] = {9,9,9,9 };

        sum(l1, l2);
    }
}
