package practice.searchingalgorithm;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] str = {"Emad", "Rehan", "Arsalan", "Arshad", "Arkam", "Ajmal", "Ahsan","Euro"};
        System.out.print("Enter the item you want to search : ");
        String target = input.next();
        System.out.println(SearchItems(str, target));


    }

    static int SearchItems(String[] str , String target){
        if(str.length== 0){
            return -1;
        }
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
