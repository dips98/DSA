package Oops.Inheritance;

class Human{ // Base class , Super class, parent class
    int age;

    void sleep(){
        age = 25;
        System.out.println("Human need sleep to perform well in bed if his age is "+age);
    }
}

class Student extends Human{ // sub class , child class // derived class
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
    }
}
