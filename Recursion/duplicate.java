public class duplicate {
    // remove duplicate char from the string
    public static void duplicate(String s, int i, StringBuilder sb, boolean map[]){
        if(i == s.length()){
            System.out.println(sb);
            return;
        }

        char curr = s.charAt(i);
        if(map[curr - 'a'] == true){
            duplicate(s, i+1, sb, map);
        } else {
            sb.append(curr);
            map[curr - 'a'] = true;
            duplicate(s, i+1, sb, map);
        }
    }

    public static void main(String[] args){
        duplicate("heelllosir", 0, new StringBuilder(""), new boolean[26]);
    }
}
