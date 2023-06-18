package String;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "22422";
        String res = "";
        for(int i=str1.length()-1;i>=0;i--){
            res = res+str1.charAt(i);
        }
        if(res.equals(str1)){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its not a palindrome");
        }
    }
}
