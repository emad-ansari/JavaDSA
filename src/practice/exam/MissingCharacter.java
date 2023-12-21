package practice.exam;

public class MissingCharacter {
    public static void main(String[] args) {
        char a = 'A';
        char[] ch = {'p', 'r', 's', 't'};
        System.out.println("missing character is : " + find_missingCharacter(ch));

    }

//    Write a Java program that returns the missing letter from an array of
//    increasing letters (upper or lower). Assume there will always be one omission from the array.


    static char find_missingCharacter(char[] ch){
       // find the ascii value of first character
        for (int i = 1; i < ch.length; i++) {
            if ((int)ch[i]  - 1 != (int)ch[i -1]){
                return (char)(ch[i - 1]  + 1);
            }
        }
        return '-';
    }
}
