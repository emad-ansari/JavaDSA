package practice.exam;

public class FIndSecret {
    public static void main(String[] args) {
        System.out.println(findSecretCount("timhellohowareyoutimwhatyouaredoingrightimnowtim", "tim"));


    }
    // this below function return the count of a string inside a big string.
    static int findSecretCount(String text, String name){

        int index = 0;
        int count = 0;
        while (text.length() != 0){
            if (text.startsWith(name)){
                count++;
                index = index + name.length();
                text = text.substring(name.length());
            }
            else {
                text = text.substring(1);
            }

        }
        return count;
    }
}

