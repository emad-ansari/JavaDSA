package practice.Recursion;

public class SkipCharacter {
    public static void main(String[] args) {
        String str = "baccad";
//        System.out.println(skipString("", str));

//        System.out.println(skipString1(str));
        System.out.println(skipApple("", "bdapplefg"));

    }

    static String skipString(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipString(p, up.substring(1));
        }
        else {
            return skipString(p + ch, up.substring(1));
        }
    }

    // taking processed string into function body
    static String skipString1(String original){
        if(original.isEmpty()){
            return "";
        }
        char ch = original.charAt(0);
        if(ch != 'a'){
            return ch + skipString1(original.substring(1));
        }
        else {
            return "" + skipString1(original.substring(1));
        }
    }


    // skip apple
    static String skipApple(String p, String up)
    {
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipApple(p + "", up.substring(5));

        }
        else {
            return skipApple(p + ch, up.substring(1));
        }
    }
}
