package Constructor;

class Student {
    int age;
    String name;

    Student() {
        System.out.println("This is constructor");
    }

    Student(int a) {
        System.out.println("This is constructor which take int parameter");
        age = a;
    }

    Student(String s) {
        System.out.println("This is constructor which take String parameter");
        name = s;
    }

    Student(int a,String s) {
        System.out.println("This is constructor which take Int and String parameter Both");
        age = a;
        name = s;
    }

    void show() {
        System.out.println("Age :" + age + "\n" + "Name :" + name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        Student s1 = new Student(6);
        s1.show();
        Student s2 = new Student("Dipesh");
        s2.show();
        Student s3 = new Student(5,"Dipesh");
        s3.show();
    }
}
