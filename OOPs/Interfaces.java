public class Interfaces {
    public static void main(String[] args){
        Bear b1 = new Bear();
        // b1.eat();

        Student s1 = new Student();
        s1.school = "xfhdf";
        Student s2 = new Student();
        // s2.getSchool();
        Student  s3 = new Student();
        s3.school = "alpha";
        // s1.getSchool();

        // Horse h1 = new Horse();
       // System.out.print(h1.color);

       Animal h2 = new Horse();
       h2.eat();

       Animal a = new Animal();
       a.eat();

       System.out.println(Student.school); // this is because school is static
    }
}

interface Carnivor {
    void eat();
}

interface Harnivor{
    void eat();  
}

class Bear implements Carnivor, Harnivor {
    public void eat (){
        System.out.println("Eat plant and meat both");
    }
}

// Static 
class Student {
    String name;
    int roll;
    static String school; // point to one memory only for all object

    void getSchool(){
        System.out.println(this.school);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat meat and grass");
    }

    Animal(){
        System.out.println("animal cons is called");
    }
}

class Horse extends Animal {
    void eat(){
        System.out.println("eat grass");
    }

    Horse(){
        super.color = "brown";  // super is use to access properties, function and consturctor of the parent class
        System.out.println("horse cons is called");
    }
}