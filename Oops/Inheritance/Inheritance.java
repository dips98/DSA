package Oops.Inheritance;

class Human{ // Base class , Super class, parent class
    int age;

    Human(){
        System.out.println("Human 's Constructor");
    }
    Human(int a){
        System.out.println("Overloading with ange param!");
        age = a;
    }
    void sleep(){
        System.out.println("Human need sleep to perform well in bed if his age is "+age);
    }
}

class Student extends Human{ // sub class , child class // derived class
    Student(){
        System.out.println("this is Student Contructor");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
        Human h = new Human(90);
        h.sleep();
    }
}
