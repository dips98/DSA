package String;

public class Pangram {
    public static void main(String[] args) {
        String str1 = "bawdsjogflickquartzvexnympih";
        System.out.println(checkPangram(str1));
    }
    public static boolean checkPangram(String str) {
    str = str.toLowerCase();
    boolean[] alphabet = new boolean[26];

    for (char c : str.toCharArray()) {
        if (Character.isLetter(c)) {
            int index = c - 'a';
            alphabet[index] = true;
        }
    }

    for (boolean letter : alphabet) {
        if (!letter) {
            return false;
        }
    }

    return true;
}

}
