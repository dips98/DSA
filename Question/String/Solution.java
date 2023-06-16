package Question.String;

class Solution {

    public static void main(String[] args) {
        String [] a = { "geeksforgeeks", "geeks", "geek","geezer" };
        String result = longestCommonPrefix(a , 4);
        System.out.println(result);
    }

    static String longestCommonPrefix(String arr[], int n) {
        String res = "";
        String match = arr[0];
        int count = 0;
        int minLength = match.length();
        for (String string : arr) {
            if (string.length() < minLength) {
                minLength = string.length();
                match = string;
            }
        }
        minLength = minLength-1;

        for (int i = 0; i <= n - 1; i++) {
            if (arr[0].substring(0, minLength).equals(match)) {
                count = count + 1;
            } else {
                count = 0;
                minLength = minLength - 1;
                match = match.substring(0, minLength);
                continue;
            }
            if (count == n) {
                res = match;
                break;
            }
        }
        if (count != n) {
            res = "-1";
        }
        return res;
    }
}