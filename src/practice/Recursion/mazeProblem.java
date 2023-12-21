package practice.Recursion;

import java.util.ArrayList;

public class mazeProblem {
    public static void main(String[] args) {

        System.out.println(RetAllPath("", 3, 3));
        printAllPath("",3, 3);

    }
    static int countAllPath(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        return countAllPath(r -1 , c) + countAllPath(r, c - 1);

    }

    static void printAllPath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        // here when row will become 1 , I can not go further down and like this when col is 1 ,I can not go further right

        if (r == 1){
            // only go right
            printAllPath(p + "R", r, c - 1);
        }
        if(c == 1){
            printAllPath(p + "D", r - 1, c);

        }
        if( r > 1 && c > 1){
            printAllPath(p + "D", r - 1, c);
            printAllPath(p + "R", r, c - 1);
        }

    }

    static ArrayList<String> RetAllPath(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // here when row will become 1 , I can not go further down and like this when col is 1 ,I can not go further right
        ArrayList<String> ans = new ArrayList<>();
        if (r == 1){
            // only go right
            ans.addAll(RetAllPath(p + "R", r, c - 1));
        }
        if(c == 1){
            ans.addAll(RetAllPath(p + "D", r - 1, c));

        }
        if( r > 1 && c > 1){
            ans.addAll(RetAllPath(p + "D", r - 1, c));
            ans.addAll(RetAllPath(p + "R", r, c - 1));
        }
        return ans;
    }
}
