package String;

public class CompareString {
    public static void main(String[] args) {
        String s1 = "Dipesh";
        String s2 =new String("Dipesh");

        // USing == operator  it will check the reference address
        if(s1==s2){
            System.out.println("True both s1 and s2 is same");
        }else{
            System.out.println("Both are not same have different reference address");
        }

        // Using equals will cheeck the inside content of the string and give the value

        if(s1.equals(s2)){
            System.out.println("True s1 content is equal to  s2");
        }
    }
}
