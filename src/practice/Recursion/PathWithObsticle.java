package practice.Recursion;

import java.util.ArrayList;

public class PathWithObsticle {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        printPath(0,  0, "", arr);
        System.out.println(printPath1(0, 0, "", arr));


    }

    static void printPath(int r, int c, String path, boolean[][] arr){
        if ( r == 2 && c == 2){
            System.out.println(path);
            return;
        }
        if (!arr[r][c]){
            return;
        }
        if ( r == 2){
            // we can go only in right
            printPath(r, c + 1, path + "R", arr);
        }
        if (c == 2){
            // we can only go in down
            printPath(r + 1, c, path + "D", arr);
        }
        // make the two recursion call for right and down
        if (r < 2 && c < 2){
            printPath(r + 1, c, path + "D", arr);
            printPath(r, c + 1, path + "R", arr);
        }
    }

    static ArrayList<String> printPath1(int r, int c, String path, boolean[][] arr){
        if ( r == 2 && c == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if ( r == 2){
            // we can go only in right
            ans.addAll(printPath1(r, c + 1, path + "R", arr));
        }
        if (c == 2){
            // we can only go in down
            ans.addAll(printPath1(r + 1, c, path + "D", arr));
        }
        // make the two recursion call for right and down
        if (r < 2 && c < 2){
            ans.addAll(printPath1(r + 1, c, path + "D", arr));
            ans.addAll(printPath1(r, c + 1, path + "R", arr));
        }
        return ans;
    }
}
