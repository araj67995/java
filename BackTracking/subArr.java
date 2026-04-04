public class subArr {

    public static void subArr(String str, String ans, int i){
        // base code
          if(i == str.length()){
            if(ans.equals("")){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
          }

        //Yes
        subArr(str, ans + str.charAt(i), i+1);

        //No
        subArr(str, ans, i + 1);
    }

    public static void main(String[] args){
        String str = "abc";
        subArr(str, "", 0);
    }
}
