public class StaticKeyword {
    static String name;
    static int age = 25;
    static{
        name = "Dipesh";
        age = 26;
        System.out.println("Static block phele aegaa");
        System.out.println(name + "'s age is "+ age);
        show();
    }
    static void show(){
        System.out.println("Showing");
    }
    public static void main(String[] args) {
        int a = 45;
        System.out.println("Main method abhi aya! "+ a);
        show();
    }
}
