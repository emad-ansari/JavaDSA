package practice.Recursion;

import java.util.ArrayList;

public class subSetQuestion {
    public static void main(String[] args) {

//        subset("abc");
        System.out.println(subsetWithRecursion1("", "abc", new ArrayList<>()));
    }

    // find all possible subsets of "abc" with iterative method
    static void subset(String str){
        boolean completeStr = false;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.charAt(i) + "" +  str.charAt(j));
            }

            if(!completeStr){
                System.out.println(str);
                completeStr = true;
            }
        }
    }


    // find all possible subsets of "abc" with recursion method
    static void  subsetWithRecursion(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // take the first character
        subsetWithRecursion(p + ch, up.substring(1));

        // ignore the first character
        subsetWithRecursion(p, up.substring(1));
    }

    // add all answer to an Arraylist
    static ArrayList<String> subsetWithRecursion1(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        // take the first character
        ArrayList<String> take =  subsetWithRecursion1(p + ch, up.substring(1), list);

        // ignore the first character
        ArrayList<String> ignore =  subsetWithRecursion1(p, up.substring(1), list);
        return list;
    }



}
