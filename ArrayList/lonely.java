import java.util.*;

public class lonely {

    public static void Lonely(ArrayList<Integer> nums) {
        ArrayList<Integer> lonely = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            int target = nums.get(i);
            int result = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (j == i) {
                    continue;
                }
                if (target == nums.get(j) || (target + 1) == nums.get(j) || (target - 1) == nums.get(j)) {
                    result = 1;
                }
            }

            if(result == 0){
                lonely.add(target);
            }
        }

        System.out.println(lonely);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 3, 3));

        Lonely(nums);
    }

}
