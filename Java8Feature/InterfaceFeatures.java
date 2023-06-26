package Java8Feature;

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
        Computer1 obj = Desktopp();
        obj.compileCode();
        System.out.println("=====");
    }
}
