package practice.Leetcode;

public class FirstOccurrence {
    public static void main(String[] args) {

        System.out.println(firstOccurrence("leetcode", "leeto"));

    }
    static int firstOccurrence(String haystack, String needle){
//
//        int index = 0;
//        while (index < haystack.length()){
//            if(haystack.startsWith(needle)){
//                return index;
//            }
//            haystack = haystack.substring(1);
//            index++;
//        }
        String up = haystack;
        for (int i = 0; i < up.length(); i++) {
            if(haystack.startsWith(needle)){
                return i;
            }
            haystack = haystack.substring(1);
        }
        return -1;

    }
}
