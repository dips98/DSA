package Oops.Inheritance;

class Human{
    int age;

    void sleep(){
        age = 25;
        System.out.println("Human need sleep to perform well in bed if his age is "+age);
    }
}

class Student extends Human{
}

public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
    }
}
