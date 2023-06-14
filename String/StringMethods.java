package String;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.indexOf("e", 2));
        System.out.println(s1.indexOf("l"));
        System.out.println(s1.lastIndexOf("l"));
    }
}
