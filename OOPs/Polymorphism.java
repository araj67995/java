public class Polymorphism {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Animal a1 = new Animal();
        Goat g1 = new Goat();

        // System.out.println(c1.sum(5, 10));
        // System.out.println(c1.sum(34.6f, 89.3f));
        // System.out.println(c1.sum(5, 6, 8));

        g1.eat();
        a1.eat();        
    }
}

// compile time - method overloading
// same name but different parameters
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Run time - method overriding
// same name but different work in child class

class Animal{
    void eat(){
        System.out.println("eat plants...");
    }
}

class Goat extends Animal{
    void eat(){
        System.out.println("eat grass...");
    }
}