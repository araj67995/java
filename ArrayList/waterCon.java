import java.util.*;

public class waterCon {

    public static int container(ArrayList<Integer> level) {
        int left = 0, right = 0;
        int maxArea = 0;

        for (int i = 0; i < level.size(); i++) {
            for (int j = i + 1; j < level.size(); j++) {

                int height = Math.min(level.get(i), level.get(j));
                int width = j - i;
                int area = height * width;

                if (area > maxArea) {
                    maxArea = area;
                    left = i;
                    right = j;
                }
            }
        }

        System.out.println("Left=" + left + " Right=" + right + " MaxArea=" + maxArea);
        return maxArea;
    }

    public static void main(String[] args) {
        ArrayList<Integer> level = new ArrayList<>(Arrays.asList(2, 9, 3, 5, 6, 8, 4, 6, 4, 3));
        
        System.out.println("Answer: " + container(level));
    }
}