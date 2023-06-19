package String;

public class Mutable {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Dipesh");
        StringBuilder str1 = new StringBuilder("str Buffer");
        str1.append(" null");
        str.append(" Upadhayay");
        System.out.println(str);
        System.out.println(str1);
    }
}
