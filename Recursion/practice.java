public class practice {
    static String numbers[] = {"zero","one","two","three","four", "five","six","seven", "eight","nine" };
    // to find position of the key in array
    public static void position(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        position(arr, key, i+1);
    }

    // print the number into text
    public static void toText(int num){
        if(num == 0){
            return;
        }
        int lastDigit = num % 10;
        num = num/10;
        toText(num);
        System.out.print(numbers[lastDigit]);
    }

    // print the lenght of the string
    public static int lenght(String str){
        if(str.length() == 0){
            return 0;
        }

        return lenght(str.substring(1)) + 1;
    }

    // print the contigus substring with same start and end char
    public static void substring(String str, int start, int end){
        if(start == str.length()){
            return;
        }

        if(end > str.length()){
            substring(str, start+1, start+2);
            return;
        }
        String sub = str.substring(start, end);
        if(sub.charAt(0) == sub.charAt(sub.length() -1)){
            System.out.print(sub+ " ");
        }
        substring(str, start, end+1);
    }

    // one left tower of hanoi

    public static void main(String[] args){
        substring("abcab", 0, 1);
    }
}
