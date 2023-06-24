package Oops.Inheritance;

// we cannot reduce the visiblity while inheriting the methods in child class. We can increase.

class Animal{
    public void eat(){
        System.out.println("Start eating!");
    }
    public int eat(int a){
        System.out.println("Start eating! and return a :"+a);
        return a;
    }
}
class Tiger extends Animal{
    public void eat() { // if you change the paramaters input it will treat as specialised method not inherited.
        System.out.println("Tiger is eating!");
    }
    public int eat(int a) { // You cant change the return type of inherted methods.
        System.out.println("Pongal khale :"+a);
        return a;
    }

}
public class RulesToOverRide {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.eat(100);
    }
}
