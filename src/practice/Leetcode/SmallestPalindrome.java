package practice.Leetcode;

public class SmallestPalindrome {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(shortestPalindrome(str));

    }
//    dcabbacd
    static String shortestPalindrome(String s){
        if (isPalindrome(s)){
            return s;
        }
        String ans = "";
        String p = "";
        for (int i = s.length() -1; i >= 1; i--) {
            p = p + s.charAt(i);
            ans = p + s;
            if (isPalindrome(ans)){
                return ans;
            }
        }
        return ans;
    }

    static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while (i <= j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
