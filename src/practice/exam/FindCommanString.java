package practice.exam;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommanString {
    public static void main(String[] args) {
        String[] first =  {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] second = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        System.out.println(findCommonString(first, second));
    }
    static ArrayList<String> findCommonString(String[] first, String[] second){
        ArrayList<String> commonString = new ArrayList<>();

        for (String value : first) {
            for (String s : second) {
                if (value.equals(s)) {
                    commonString.add(value);
                }
            }
        }
        return commonString;
    }
}
