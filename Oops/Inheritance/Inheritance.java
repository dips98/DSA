package Oops.Inheritance;

class Human { // Base class , Super class, parent class
    int age;
    private String Name;

    Human() {
        System.out.println("Human 's Constructor");
    }

    Human(int a) {
        System.out.println("Overloading with ange param!");
        age = a;
    }

    void sleep() {
        System.out.println("Human need sleep to perform well in bed if his age is " + age);
    }
}

class Student extends Human { // sub class , child class // derived class
    Student() {
        System.out.println("this is Student Contructor");
    }

    void display() {
        System.out.println("The age is " + age);
        // System.out.println("The Name is "+ name); // private is not allowed in
        // inhertance
    }

    // Contructor won't inherted in class Due to super() it calling parent class
    // contructor then child contructer eill execute in student class example
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
        Human h = new Human(90);
        h.sleep();
    }
}
