public class string {
    public static int shortestPath(String str) {
        int y = 0;
        int x = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }
        }

        int shortestPath = (int) Math.sqrt(x * x + y * y);

        return shortestPath;
    }

    public static void toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);
    }

    public static void compression(String str){
        StringBuilder str2 = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            int count = 1;
            while(str.charAt(i) == str.charAt(i + 1)){
               count++;
               i++;
            }
            
            if(count > 1){
                str2.append(str.charAt(i));
                str2.append(count);
            } else 
                str2.append(str.charAt(i));
        }

        System.out.println(str2);
    }

    //upper case to lower case
    public static void tolower(){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print((char)(ch| ' '));
        }
    }

    public static void main(String[] args) {
        // String str = "WNEENESENNN";

        // System.out.println(shortestPath(str));

        // String s1 = "Hello";
        // String s2 = new String("Hello");

        // if (s1.equals(s2)) {
        //     System.out.println("both string are equal");
        // } else {
        //     System.out.println("both are not equal");
        // }

        // String str2[] = { "apple", "banana", "mango" };
        // String largest = str2[0];
        // for (int i = 0; i < str2.length; i++) {
        //     if (largest.compareTo(str2[i]) < 0) {
        //         largest = str2[i];
        //     }
        // }

        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");

        // for (char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }

        // System.out.println(sb);

        // String strr = "hello sir, i am aditya raj";
        // toUpperCase(strr);

        // compression("aaaaabbbggggcd");
        tolower();
    }
}
