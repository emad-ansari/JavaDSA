package practice.basic;

import java.util.StringTokenizer;

public class SearchWord{
  public static void main(String[] args){
    String str = "I love Madina";
    System.out.println(searchWord(str, "Madina"));
    
  }

  // write a program to search a word in text string 

  static boolean searchWord(String text, String target){
    StringTokenizer tokens =  new StringTokenizer(text);
    while (tokens.hasMoreTokens()){
      if (tokens.nextToken().equals(target)){
        return true;
      }
    }
    return false;
  }
}
