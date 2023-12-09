package oops.exam;
import java.util.StringTokenizer;
public class StringToken {
    public static void main(String[] args) {
        StringTokenizer tokens = new StringTokenizer("<p>hello my name is emad</p>");
        System.out.println(tokens.countTokens());
//        System.out.println(tokens.nextToken());
        // printing all token
        int index = 1;
        while (tokens.hasMoreTokens()){
            System.out.println(index + "th token");
            System.out.println(tokens.nextToken());
            index++;
        }


    }





}