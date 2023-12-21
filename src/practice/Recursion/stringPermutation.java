package practice.Recursion;

import java.util.ArrayList;

public class stringPermutation {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutation1("", "abc", new ArrayList<>()));
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // here the number of recursive function call at each recursion level will depend on length of process string
        // so, no of recursion call = p.length + 1
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            // here process will be p = f + ch + s
            permutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permutation1(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // here the number of recursive function call at each recursion level will depend on length of process string
        // so, no of recursion call = p.length + 1
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            // here process will be p = f + ch + s
            permutation1(f + ch + s, up.substring(1), list);
        }
        return list;
    }
}
