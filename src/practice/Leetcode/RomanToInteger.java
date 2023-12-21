package practice.Leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));

    }
    static int romanToInt(String s){
        int sum = 0;
        int j = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            arr[i] = convertInteger(num);
        }
        while (j < arr.length){
            if( j < arr.length - 1 && arr[j]  < arr[j + 1]){
                sum = sum + arr[j + 1] - arr[j];
                j += 2;
            }
            else {
                sum = sum + arr[j];
                j++;
            }

        }
        return sum;

    }
    static int convertInteger(char num){
        int number = 0;
        switch(num){
            case 'M':
                number =  1000;
                break;


            case 'D':
                number =  500;
                break;

            case 'C':
                number =  100;
                break;


            case 'L':
                number = 50;
                break;

            case 'X':
                number =  10;
                break;

            case 'V':
                number = 5;
                break;

            case 'I':
                number = 1;
                break;

            default :
                number = -1;
                break;
        }
        return number;
    }
}
