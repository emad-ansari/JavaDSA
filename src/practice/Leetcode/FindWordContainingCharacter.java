package practice.Leetcode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character/description/
class FindWordContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(words, 'a'));
        
    }
     public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (isFind(words[i], x)){
                ans.add(i);
            }
            
        }
        return ans;
    }
    private static boolean isFind(String str, char target){
        // how i will find that target lies in str or not 
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    
}