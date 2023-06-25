package Interface;

interface A { // Interface cant be initiated , dont have constructor
    // Inside all methods public and abstract
    // variable will be public static final
    int a = 90;

    void display(); // by deafult abstract

    void man();
}

interface B {
    String name = "Dipesh";
}

public class Interface {
    public static void main(String[] args) {
        System.out.println(A.a + " " + B.name + "");
    }
}

// Interface
// 1. It will allow only abstract methods
// 2. It cannot ne initiated
// 3. Variables are pulic static final
// 4. Methods are public and abstract
// 5. No constructor in Interface