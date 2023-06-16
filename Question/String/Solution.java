package Question.String;

class Solution {

    public static void main(String[] args) {
        String [] a = { "geeksforgeeks", "geeks", "geek","geezer" };
        String result = longestCommonPrefix(a , a.length);
        System.out.println(result);
    }
//  All test casenot passing Oops! Im noob  orignal code.
    // static String longestCommonPrefix(String arr[], int n) {
    //     String res = "";
    //     String match = arr[0];
    //     int count = 0;
    //     int minLength = match.length();
    //     for (String string : arr) {
    //         if (string.length() < minLength) {
    //             minLength = string.length();
    //             match = string;
    //         }
    //     }
    //     minLength = minLength-1;

    //     for (int i = 0; i <= n - 1; i++) {
    //         if (arr[i].substring(0, minLength+1).equals(match)) {
    //             count = count + 1;
    //         } else {
    //             count = 0;
    //             minLength = minLength - 1;
    //             match = match.substring(0, minLength+1);
    //             i = -1;
    //         }
    //         if (count == n) {
    //             res = match;
    //             break;
    //         }
    //     }
    //     if (count != n) {
    //         res = "-1";
    //     }
    //     return res;
    // }

    //  Used rajat code for understanding and submiiting on geeksfor geeks
    static String longestCommonPrefix(String arr[], int n){
        String s = arr[0];
    	for(int i=0;i<arr.length;i++) {
    		if(s.length()>arr[i].length()) {
    			s = arr[i];
    		}
    	}
    	
    	int k=s.length();
    	while(k>0) {
    		String ss = s.substring(0, k);
    		boolean f = false;
    		for(int i=0;i<arr.length;i++) {
    			if(!arr[i].substring(0, k).equals(ss)) {
    				f = true;
    				break;
    			}
    		}
    		if(f==false) {
    			return ss;
    		}
    		k--;
    	}
    	return "-1";
    }
}