package practice.Leetcode;

//  It has been solved but try to solve how to remove non-Alphanumeric character in string

public class ValidPalindrome {
    public static void main(String[] args) {
//        String str1 = "Coding12#*( $ Ninj@$";
//        //replace all characters other than alphanumeric
//        str1 = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        System.out.println(str1);
        System.out.println(isPalindrome(" "));
            String s = " ";
        System.out.println(s.length());
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }



}
