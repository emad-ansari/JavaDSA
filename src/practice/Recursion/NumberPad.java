package practice.Recursion;

import java.util.ArrayList;

public class NumberPad {
    public static void main(String[] args) {
//        numPad("12");
        System.out.println(numPadWithRecursion("", "12", new ArrayList<>()));
    }

    // first iterative method
    static void numPad(String num){
        char first;
        char second;
        int num1 = Character.getNumericValue( num.charAt(0));
        int num2 = Character.getNumericValue(num.charAt(1));
        int num1Start = (3*num1 - 2);
        int num1End = num1Start + 3;

        int num2Start = (3*num2 - 2);
        int num2End = num2Start + 3;
        if (num2 == 9){
            num2End = num2Start + 2;
        }
        if (num1 == 9){
            num1End = num1Start + 2;
        }
        for (int i = num1Start; i < num1End; i++) {
            first = (char)(96 + i);
            for (int j = num2Start; j < num2End; j++) {
                second = (char)(96 + j);
                System.out.println(first + "" +  second);
            }
        }
    }
    // return list of answer
    static ArrayList<String> numPadRetList(String num){
        ArrayList<String> list = new ArrayList<>();
        char first;
        char second;
        int num1 = Character.getNumericValue( num.charAt(0));
        int num2 = Character.getNumericValue(num.charAt(1));
        int num1Start = (3*num1 - 2);
        int num1End = num1Start + 3;

        int num2Start = (3*num2 - 2);
        int num2End = num2Start + 3;
        if (num2 == 9){
            num2End = num2Start + 2;
        }
        if (num1 == 9){
            num1End = num1Start + 2;
        }
        for (int i = num1Start; i < num1End; i++) {
            first = (char)(96 + i);
            for (int j = num2Start; j < num2End; j++) {
                second = (char)(96 + j);
                String ans = first + "" +  second;
                list.add(ans);
            }
        }
        return list;
    }

    static ArrayList<String> numPadWithRecursion(String p, String up, ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = Character.getNumericValue(up.charAt(0));
        for (int i = (digit - 1) * 3; i < 3 * digit ; i++) {
            numPadWithRecursion(p + (char)('a' + i) , up.substring(1), list);
        }
        return list;
    }
}
