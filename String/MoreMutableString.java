package String;

public class MoreMutableString {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(190);
        s.append("Dipesh");
        s.setCharAt(0, 'C');
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());
        StringBuilder s1 = new StringBuilder(150);
        s1.append("null");
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        s1.trimToSize();
        System.out.println(s1.capacity());
        s1.reverse();
        System.out.println(s1);

    }
}
