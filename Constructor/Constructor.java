package Constructor;

class Demo{
    int a = 45;
    int b = 24;

    void show(){
        System.out.println(a +" "+ b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}
