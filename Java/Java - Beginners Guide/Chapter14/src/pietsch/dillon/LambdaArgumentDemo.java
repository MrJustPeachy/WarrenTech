package pietsch.dillon;

/**
 * PROGRAM NAME: LambdaArgumentDemo.java
 * PROGRAM PURPOSE: Try This 14-1 that shows lambda with arguments
 * PROGRAMMER: Dillon Pietsch
 * DATE WRITTEN: {6/25/2017}
 */

interface StringFunc {
    String func(String str);
}

public class LambdaArgumentDemo {

    static String changeStr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String args[]){

        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        StringFunc reverse = (str) -> {
            String result = "";

            for(int i= str.length(); i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        StringFunc remove = (str) -> {
            String result = "";

            for(int i= str.length(); i >= 0; i--)
                if(str.charAt(i) != ' ') result += str.charAt(i);

            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++){
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }

            return result;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);

    }

}
