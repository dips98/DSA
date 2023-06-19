package String;

public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Dipesh");
        s1.append("nulljcnwejkfwefjwefnweejfwenfjfw");
        StringBuilder s2 = new StringBuilder("Dipesh");
        s2.append("Bolam");
        System.out.println(s1.capacity() +" "+s2.capacity());

        // The main difference is StringBuffer does not support multi threding where StringBuilder supports multithreading.
    }
}
