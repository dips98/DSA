class MethodOverLoading{
    public void show(byte a) {
        System.out.println("Byte: "+ a);
    }
    public void show(short a) {
        System.out.println("short: "+ a);
    }
    public void show(int a) {
        System.out.println("int: "+ a);
    }
    public void show(long a) {
        System.out.println("long: "+ a);
    }
    public void show(float a) {
        System.out.println("float: "+ a);
    }
    public void show(double a) {
        System.out.println("double: "+ a);
    }
    public void show(char a) {
        System.out.println("char: "+ a);
    }
}

public class PromotionOverLoading {
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        byte a = 2;
        obj.show(a);
    }
}
