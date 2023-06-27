package Java8Feature;

// Java 8 feature we can define method (Body of function) in Interface
// 

interface Computer1 {
    void compileCode();
    default void config(){
        System.out.println("Used deafult!");
    }
}

class Developerr {
    void buildApp(Computer1 l) {
        System.out.println("Building the app!");
        l.compileCode();
    }
}

class Desktopp implements Computer1 {
    public void compileCode() {
        System.out.println("Compiling the code onn desktop!");
    }
}

class Laptopp implements Computer1 {
    public void compileCode() {
        System.out.println("Compiling the code on laptop!");
    }
}

public class InterfaceFeatures {
    public static void main(String[] args) {
        Computer1 obj = new Desktopp();
        obj.compileCode();
        Computer1 obj1 = new Laptopp();
        obj1.config();
    }
}
