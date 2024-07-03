package practice.Leetcode;
// SOLVED
// https://leetcode.com/problems/longest-common-prefix/submissions/

public class LongestCommonPrefix {
//    public static void main(String[] args) {
//        String[] str = {"flower","flo","flowai","flowtu"};
//        System.out.println("Longest Common prefix is: " + longestCommonPrefix(str));
//    }

    public static String longestCommonPrefix(String[] str){
        if (str.length == 1 || str[0].isEmpty()){
            return str[0];
        }
        String lp = "";
        int k = 0;
        String s = str[0].charAt(k) + "";

        int i = 0;
        while (true){
            if (!str[i].startsWith(s)){
                return lp;
            }

            i++;
            if (i == str.length){
                if (s.equals(str[0])){
                    break;
                }
                lp = s;
                k++;
                s = s + str[0].charAt(k);
            }

            i = i % str.length;
        }
        return s;

    }



    public static String findLongestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string as the initial longest common prefix
        String prefix = strs[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by comparing it with the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length until a common prefix is found
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + findLongestCommonPrefix1(strs));
    }
}










//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 1 || strs[0].equals("")){
//            return strs[0];
//        }
//
//        String lp = "";
//        String f = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            String current = strs[i];
//            String s = f.charAt(0) + "";
//            while (current.startsWith(s) && f.length() > 0 && current.length() > 0){
//                if (current.equals(f)){
//                    lp = current;
//                    break;
//                }
//                else{
//                    if (f.length() >= current.length()){
//                        f = f.substring(0, f.length() -1);
//                    }
//                    else {
//                        current = current.substring(0, current.length() -1);
//                    }
//                }
//            }
//        }
//        return lp;
//    }




