package Java8Feature;

interface Computer {
    void compileCode();
    default void config(){
        System.out.println("Used deafult!");
    }
}

class Developer {
    void buildApp(Computer l) {
        System.out.println("Building the app!");
        l.compileCode();
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("Compiling the code onn desktop!");
    }
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("Compiling the code on laptop!");
    }
}

public class InterfaceFeatures {
    public static void main(String[] args) {
        
    }
}
