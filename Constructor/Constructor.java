package Constructor;

class Demo {
    int a = 45;
    int b = 24;

    Demo(int a, int b) {
        System.out.println("First Contructor will execute" + " Given Parameter :" + a);
        this.a = this.a + a;
        this.b = this.b + b;
    }

    void show() {
        System.out.println(a + " " + b);
    }

    void change() {
        a = a - 100;
        b = b - 100;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo d = new Demo(56, 1);
        d.show();
        Demo d1 = new Demo(1, 2);
        d1.change();
        d1.show();
    }
}
