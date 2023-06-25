package Oops;

class A{ // If you make parent class final it cannot be inherited by any one
    final int a = 80;
    void play(){  // If you made final method then u can't override the method in child class
        System.out.println("Play");
    }
}
class B extends A{
    void play() {  // If parent class is final class then u cant over ride the method in chlid class
        super.play();
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        B b = new B();
        // b.a = 89; // final u cant change the value its constant like in java script
        System.out.println(b.a);
    }
}
