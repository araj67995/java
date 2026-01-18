public class Inheritance {
    public static void main(String[] args){
       Fish f1 = new Fish();
       f1.eat();
       f1.breath();
       f1.color = "black";
       f1.swim();
       f1.fins = 2;
       System.out.println(f1.color);
       System.out.println(f1.fins);
    }
}

// parent or base class
class Animal{
    String color;

    void eat(){
        System.out.println("Aninmals eat food");
    }

    void breath(){
        System.out.println("Animal take oxygen");
    }
}

// child or derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("fish swims");
    }
}
