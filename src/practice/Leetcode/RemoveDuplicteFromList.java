package practice.Leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicteFromList {
//    I have given list of list and i have to check whether two list contains the smae
//    element or not if it contains remove one of them form the outer list
    public static void main(String[] args) {
        List<List<Integer>> outer  = new ArrayList<>();
        List<Integer> inner1 = new ArrayList<>();
        inner1.add(1);
        inner1.add(3);
        inner1.add(2);

        List<Integer> inner2 = new ArrayList<>();
        inner2.add(2);
        inner2.add(1);
        inner2.add(3);
        Collections.sort(inner2);

        Collections.sort(inner1);
        outer.add(inner1);
        outer.add(inner2);
        List<List<Integer>> ans = new ArrayList<>();
        for (List<Integer> list: outer){
            if( !ans.contains(list)){
                ans.add(list);
            }
        }
        System.out.println(ans);
    }


}
