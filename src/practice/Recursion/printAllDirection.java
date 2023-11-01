package practice.Recursion;

import java.util.ArrayList;

public class printAllDirection {
    public static void main(String[] args) {
        // write the logic to traverse in all the direction
        boolean[][] arr = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(printPath1(0, 0, "", arr));

    }
    static ArrayList<String> printPath1(int r, int c, String path, boolean[][] arr){
        if ( r == 2 && c == 2){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        arr[r][c] = false;

        if ( r > 0  && arr[r - 1][c]){

            ans.addAll(printPath1(r - 1, c, path + "U", arr));
        }
        if ( c > 0 && arr[r][c - 1]){

            ans.addAll(printPath1(r, c - 1, path + "L", arr));
        }
        if ( r < 2 && arr[r + 1][c]){

            ans.addAll(printPath1(r + 1, c , path + "D", arr));
        }
        if (c < 2 && arr[r][c + 1]){

            ans.addAll(printPath1(r , c + 1, path + "R", arr));
        }

        arr[r][c] = true;
        return ans;
    }

}
