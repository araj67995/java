import java.util.*;

public class list {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(34);
        list.add(88);
        list.add(3, 17);
        // System.out.println(list.get(2));
        System.out.println(list);

        // Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
