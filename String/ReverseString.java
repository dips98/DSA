package String;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("My Name is Anthony Gonsalvis");
        String reversedString = reverseString(s1);
        System.out.println(reversedString);
    }

    public static String reverseString(String  s1){
        String result = "";
        for (int i=s1.length() - 1;i>=0;i--){
            result = result + s1.charAt(i);
        }
        return result;
    }
}
