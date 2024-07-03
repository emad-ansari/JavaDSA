package HigherOrderAlgorithm;

public class NaiveStringSearch {
    public static void main(String[] args) {
        findPattern("AABAACAADAABAABA", "AABA");

    }
    public static void findPattern(String text, String pattern){
        int m = pattern.length();
        int n = text.length();

        for (int i = 0; i < n - m; i++) {
            int j;
            for (j = 0; j < m; j++){
                if (text.charAt(i + j) != pattern.charAt(j)){
                    break;
                }
            }
            if (j == m){
                System.out.println("Pattern found at index:  " + i);
            }
        }
    }
}
