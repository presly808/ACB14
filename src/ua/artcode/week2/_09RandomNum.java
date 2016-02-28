package ua.artcode.week2;

/**
 * Created by serhii on 28.02.16.
 */
public class _09RandomNum {

    // user
    public static void main(String[] args) {
        // public static <return_type> <name>(<type1> <name1>, <type> <name2>)
        double res = Math.pow(2,5);
        // public static double random()
        double random = Math.random(); // 0...1 ex 0.2345565334

        System.out.println(random);

        // get some range 0.54481494143 * 100 = (int)54.481494143 = 54

        // void println(String in)
        System.out.println("");


        for (int i = 0; i < 10; i++) {
            double random1 = Math.random();
            int ran = (int)(random1 * 15);
            System.out.println(random1);
            System.out.println(ran);
        }

        System.out.println("Hello");
    }



}
