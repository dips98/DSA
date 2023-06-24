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
class C extends B{
    C(){
        System.out.println("C constructor");
    }
} 
class D extends C{
    D(){
        System.out.println("D constructor");
    }
} 
public class MultiLevelInhertance {
    public static void main(String[] args) {
        D d = new D();
        d.sayHi();
    }
}
