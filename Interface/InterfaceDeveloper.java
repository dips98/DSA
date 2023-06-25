package Interface;

// abstract class Computer{
//     abstract void compileCode();
// }

//  Instead of abstract class we can use interface do the same 

interface Computer{
    void compileCode();
}

class Developer {
    void buildApp(Computer l) {
        System.out.println("Building the app!");
        l.compileCode();
    }
}

class Desktop implements Computer{
    public void compileCode() {
        System.out.println("Compiling the code onn desktop!");
    }
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("Compiling the code on laptop!");
    }
}

public class InterfaceDeveloper {
    public static void main(String[] args) {
        // Computer l = new Laptop();
        Computer l = new Desktop();
        Developer d = new Developer();
        d.buildApp(l);
    }
}
