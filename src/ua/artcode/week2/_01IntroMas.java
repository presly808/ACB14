package ua.artcode.week2;

/**
 * Created by serhii on 27.02.16.
 */
public class _01IntroMas {

    public static void main(String[] args) {
        String[] mas = new String[10];
        String el0 = mas[0];
        mas[1] = "Petro";
        mas[2] = "Ivan";

        /*int index = 234 + 34;

        String el_1 = mas[-1];
        String test = mas[index];*/

        /* <type>[] <name> = new <type>[<size>];
        *  <type>[] <name> = {e1,e2,e3,e4,e4};
        * */

        int[] nums = {1,2,4,5,6,7};
        nums = new int[23];

        System.out.println(nums[0]);

        int sizeOfArr = nums.length;

    }
}
