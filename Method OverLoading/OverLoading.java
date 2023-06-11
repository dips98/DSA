// This is demonstartinf the method over loading 
class MethodOverLoading{
    public float add(float a, float b) {
        return a+b;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
    public char add(char a, char b) {
        return (char) (a+b);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        int result = obj.add(5,77);
        float resultFloat = (float) obj.add(4.6, 7.9);
        System.out.println(result);
        System.out.println(resultFloat);
    }
}
