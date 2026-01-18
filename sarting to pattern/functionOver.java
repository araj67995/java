public class functionOver {
    // Function Overloading using parmeters
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    // Function Overloading using data Types
    public static float sum(float a, float b){
        return a + b;
    }
    public static float sum(float a, float b, float c){
        return a + b + c;
    }

    public static void main(String[] args){
        System.out.println(sum(8,6,5));
        System.out.println(sum(6.74f, 8.26f, 5));
    }
    
}
