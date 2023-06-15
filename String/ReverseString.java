package String;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("My Name is Anthony Gonsalvis");
        System.out.println("Before Reverse : "+ s1);
        String reversedString = reverseString(s1);
        System.out.println("After  Reverse : "+reversedString+ " of "+ s1);
        String []a = s1.split(" ");
        String arrayString = reverseArrayString(a);
        System.out.println("This is array string reversed : " + arrayString);
    }

    private static String reverseArrayString(String []a) {
        String res = "";
        for(int i=a.length-1;i>=0;i--){
            res = res + a[i];
        }
        return res;
    }

    public static String reverseString(String  s1){
        String result = "";
        for (int i=s1.length() - 1;i>=0;i--){
            result = result + s1.charAt(i);
        }
        return result;
    }
}
