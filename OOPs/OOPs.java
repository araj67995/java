public class OOPs {
    public static void main(String[] args) {

        // Pen p1 = new Pen(); // created a object using class
        // p1.setColor("blue"); // using function
        // p1.tip = 5; // direct change
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        // BankAccount s1 = new BankAccount();
        // s1.name = "Aditya";
        // s1.changePassWord("xyz12");
        // System.out.println(s1.name);
        // System.out.println(s1.getPass());

        Student s1 = new Student("Aditya");
        s1.roll = 8;
        s1.cgpa = 10;
        s1.marks[0] = 80;
        s1.marks[1] = 50;
        s1.marks[2] = 90;
        Student s2 = new Student();
        Student s3 = new Student(8);
        Student s4 = new Student(s1);
        System.out.println(s4.name);
        System.out.println(s4.roll);
        System.out.println(s4.cgpa);
        s1.marks[1] = 20;

        for(int i = 0; i < 3; i++){
            System.out.print(s4.marks[i]+ " ");
        }

    }
}

class Student {
    String name;
    int roll;
    int cgpa;
    int marks[];

    // non-parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("constructor called....");
    }

    // constructor (parameterized)
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    // shallow copy consturctor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.cgpa = s1.cgpa;
    //     this.marks = s1.marks; // the change will also reflect in s4 because it point to same array
    // }

    // Deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.cgpa = s1.cgpa;
        for(int i = 0; i < 3; i++){
            this.marks[i] = s1.marks[i]; // the change will not reflect because new array is formed
        }
    }
}

// Encapsulation
class BankAccount {
    String name;
    private String password; // it cannot be acces by other directly

    // change the password
    void changePassWord(String newPassword) {
        password = newPassword;
    }

    // only way to access (getter or setter)
    String getPass() {
        return this.password;
    }
}

// new class
class Pen {
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
