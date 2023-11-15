package practice.Leetcode;

public class ExelSheetColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }

    public static  String convertToTitle(int columnNumber) {

        String ans = "";

        while (columnNumber != 0){
            if (columnNumber % 26 == 0){
                int n = columnNumber / 26;
                ans =  (char)(65 + 26- 1) + ans;
                columnNumber = n -1;
            }
            int rem = columnNumber % 26;
            ans =  (char)(65 + rem - 1) + ans;
            columnNumber /= 26;
        }
        return ans;
    }
}
