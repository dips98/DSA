package Oops.Inheritance;
//  Not allowed in java
// It diamond shape problem its inherting the object class 
class A{
    A(){
        System.out.println("A constructor!");
    }
    void sayHi(){
        System.out.println("Hi");
    }
}
class B extends A,B{  // getting error multiple inheritance not allowed in java
    B(){
        System.out.println("B constructor");
    }
}
class C extends B,A{ // getiing eror multiple inheritance not allowed in java
    C(){
        System.out.println("C constructor");
    }
} 
public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}
