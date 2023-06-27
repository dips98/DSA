package Java8Feature;

// Java 8 feature we can define method (Body of function) in Interface
// We can use type of interface to crate an object
// Static method also we can define in Interfface

// Three Types of Interface 
// 1. Single Abstract Method Interface (SAM Interface- compulsory one method allowed) Also Called [Functional Interface]
// 2. Normal Interface (Contains Multiple methods)
// 3. Marker (No methods are there called Marker Interface)

interface Computer1 {
    void compileCode();

    default void config() {
        System.out.println("Used deafult!");
    }

    static void Show() {
        System.out.println("Show");
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
        Computer1.Show();
    }
}
