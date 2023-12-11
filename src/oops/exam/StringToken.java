package oops.exam;
import java.util.StringTokenizer;
public class StringToken {
    public static void main(String[] args) {
//        StringTokenizer tokens = new StringTokenizer("<p>hello my name is emad</p>");
//        System.out.println(tokens.countTokens());
////        System.out.println(tokens.nextToken());
//        // printing all token
//        int index = 1;
//        while (tokens.hasMoreTokens()){
//            System.out.println(index + "th token");
//            System.out.println(tokens.nextToken());
//            index++;
//        }

        System.out.println(checkString(new StringTokenizer("this is my country. name India and i love my country very much "), "India"));


    }


    static boolean checkString(StringTokenizer tokens, String str){
        while (tokens.hasMoreTokens()){
            if (tokens.nextToken().equals(str)){
                return true;
            }
        }
        return false;

    }




}