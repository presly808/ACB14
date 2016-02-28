package ua.artcode.week2;

import java.util.Scanner;

import ua.artcode.week2.method.ArrayUtils;

public class _11RandomPass {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input pass size");
        int size = in.nextInt();


        System.out.println("input range");
        int range = in.nextInt();

        int[] mas = ArrayUtils.generateMas(size,range);

        ArrayUtils.printArr(mas);


        System.out.println("you are pleasured?");
        boolean isGoodPass = in.nextBoolean();

        if(isGoodPass){

            System.out.println("*****************");
            ArrayUtils.printArr(mas);
            System.out.println("*****************");


        } else {
            System.out.println("Repeat action");

            mas = ArrayUtils.generateMas(size,range);

            System.out.println("new pass");
            ArrayUtils.printArr(mas);

        }









    }
}
