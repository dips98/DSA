class Demo {
    static int a;
    static int b;

    int m;
    int n;

    static {
        a = 45;
        b = 65;
        System.out.println("Initialize a = " + a + " b = " + b + " Conntrol in static block!");
    }

    {
        m = 99;
        n = 89;
        System.out.println("Control in not static block m = "+m+" n = "+n);
    }

    static void display(){
        System.out.println("value of static variable a = "+ a + " b = " + b);
    }

    void display1(){
        System.out.println("value of non-static variable m = "+ m + " b = " + n);
    }

}

public class StaticLaunch {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
        d.display1();
    }
}
