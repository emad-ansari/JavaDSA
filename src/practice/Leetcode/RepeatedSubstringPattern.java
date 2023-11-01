package practice.Leetcode;
//https://leetcode.com/problems/repeated-substring-pattern/description/
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(repeatedSubstringPattern(s));

    }
    static boolean repeatedSubstringPattern(String s){
//        int i = 0;
//        int j = s.length() - 1;
//        while (i <= j){
//            if (s.charAt(i) != s.charAt(j)){
//                return true;
//            }
//            i++;
//            j--;
//        }
//        return false;

        String p = "";
        for (int i = 0; i < s.length(); i++) {
            p = p + s.charAt(i);
            if(s.substring(i + 1).startsWith(p)){
                return true;
            }

        }
        return false;
    }
}
