import java.util.*;

public class pairSum {

    // there are three way 1- simple two loop, 2- one loop form left another form
    // right in sorted array
    // 3- same as 2 but in rotated list
    public static boolean PairSum(ArrayList<Integer> list, int target) {
        // first find the index from where array is rotated
        int n = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                n = i;
                break;
            }
        }

        int lp = n;
        int rp = n + 1;

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            int i = list.size();
            if (sum == target) {
                return true;
            }

            if (sum > target) {
                lp = (i + lp - 1) % i;
            }

            if (sum < target) {
                rp = (rp + 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 7, 9, 10)); // rotated list

        System.out.println(PairSum(list, 16));;
    }
}
