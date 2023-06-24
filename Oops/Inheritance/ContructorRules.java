package Oops.Inheritance;

class Animal{
    int m;
    int n;
    Animal(){
        System.out.println("Parent contstructor!");
    }
    Animal(int a,int b){
        this.m = a;
        this.n = b;
        System.out.println("Paramerised Contructor!");
    }
}

class Tiger extends Animal{
    Tiger(){
        this(6,67);
        System.out.println("Child constructor!");
    }
    Tiger(int a,int b){
        m = a;
        n = b;
        System.out.println("Paramerised Contructor!");
    }

}

public class ContructorRules {
    public static void main(String[] args) {
        Tiger t = new Tiger();

    }
}
