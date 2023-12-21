package practice.Leetcode;
// https://leetcode.com/problems/longest-common-prefix/submissions/
// SOLVED
public class LongetsCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(str));
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


    public static String longestCommonPrefix(String[] str){
        if (str.length == 1 || str[0].equals("")){
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
}
