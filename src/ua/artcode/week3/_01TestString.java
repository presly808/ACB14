package ua.artcode.week3;

/**
 * Created by serhii on 05.03.16.
 */
public class _01TestString {


    public static void main(String[] args) {
        // create

        String s1 = new String("new");
        String s2 = "value";

        String s3 = 34 + "";

        String s4 = String.valueOf(33);
        String s5 = String.valueOf(34.56);
        String s6 = String.valueOf(true);


        String src = "name = Oleg, age 30, salary 4000.00, strong true";

        char[] chars = src.toCharArray();

        char firstLetter = src.charAt(0);

        String a1 = new String("Andrey");
        String a2 = "Andrey";
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        int codePoint = src.codePointAt(0);
        System.out.println("codePoint of 'n' is " + codePoint);

        // if Oleg < Andrey negative num, Oleg > Andrey positive num, Oleg == Andrey '0'
        int compareRes = "Oleg".compareTo("Andrey");
        System.out.println(" compareRes " + compareRes);

        //new Scanner(System.in).nextInt();

        boolean containsRes = "abcd".contains("bc");
        System.out.println("abcd".equalsIgnoreCase("ABCD"));

        String json = "{name:Oleg,age:40,salary:3000}";
        System.out.println(json.startsWith("{"));
        System.out.println(json.endsWith("}"));

        int start = json.indexOf("Oleg");
        int end = json.indexOf(",");

        // [)
        String part = json.substring(start, end);
        System.out.println(part);

        int aLastIndex = json.lastIndexOf("a");

        int symbolsSize = json.length();
        String lowerCase = "ABC".toLowerCase();
        String upperCase = "abcc".toUpperCase();

        String replaceRes = json.replaceAll(",", "|");
        System.out.println(replaceRes);

        String res = "          one two three four five        ".trim();

        System.out.println(res);

        String[] parts = "one  two  three  four  five".split(" ");


    }
}
