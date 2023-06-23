package Oops.Inheritance;
class A{
    A(){
        System.out.println("A constructor!");
    }
    void sayHi(){
        System.out.println("Hi");
    }
}
class B extends A{
    B(){
        System.out.println("B constructor");
    }
}
public class SingleInhertance {
    public static void main(String[] args) {
        B b = new B();
        b.sayHi();
    }
}
