package ua.artcode.week2;

/**
 * Created by serhii on 27.02.16.
 */
public class _06CharArrVsString {


    public static void main(String[] args) {
        char[] seq = {'s','e','r','h','i','i'};

        String seq2 = "serhii";

        // String -> mas
        char[] mas2 = seq2.toCharArray();
        // mas -> String
        String seq3 = new String(mas2);


    }
}
