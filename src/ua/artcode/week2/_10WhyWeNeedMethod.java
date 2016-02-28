package ua.artcode.week2;

import java.util.Scanner;

/**
 * Created by serhii on 28.02.16.
 */
public class _10WhyWeNeedMethod {
    // simplify
    // set name to actions
    // repeatable calling

    public static void main(String[] args) {


        inputNameAndSayHello();


        inputNameAndSayHello();


        inputNameAndSayHello();

    }

    //1
    public static void inputNameAndSayHello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name");
        String name = scanner.next();
        String message = "hello " + name;
        System.out.println(message);
    }


}
