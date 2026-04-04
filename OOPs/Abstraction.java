public class Abstraction {
    public static void main(String[] args){
        Horse h = new Horse();
         h.eat();
        System.out.println(h.color);
        h.walk();

        Dog d = new Dog();
        d.eat();
        System.out.println(d.color);
    }    
}

// cannot create object of this class
abstract class Animal{
    String color;
    //  non abstract
    void eat(){
        System.out.println("eat grass");
    }

    // using abstract [only create idea that should be define in child class]
    abstract void walk();

    // constructor [first parent constructor will be called]
    Animal(){
        color = "brown"; // sets color to all child class
    }
}

// child class
class Horse extends Animal {
    void walk() {
        System.out.println("Walk on 4 leg");      
    }

    Horse(){  // second child constructor should be called
        this.color = "black";
    }
}

// child 2
class Dog extends Animal{
    void walk(){
        System.out.println("Walk on 4 leg");
    }
    void eat(){
        System.out.println("eat meat");
    }
}
