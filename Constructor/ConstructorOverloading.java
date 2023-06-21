package Constructor;

class Student{
    int age;
    String name;

    Student(){
        System.out.println("This is constructor");
    }
    Student(int a){
        System.out.println("This is constructor which take int parameter");
        age = a;
    }
    void show(){
        System.out.println("Age :"+age+"\n"+"Name :"+name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        
    }
}
