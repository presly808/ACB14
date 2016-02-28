package ua.artcode.week2;

import ua.artcode.week2.method.ArrayUtils;

/**
 * Created by serhii on 28.02.16.
 */
public class _12GenAndConvertTest {


    public static void main(String[] args) {

        int[] mas = ArrayUtils.genRandomMasEvenNum(10, 100);
        String res = ArrayUtils.convert(mas);
        System.out.println(res);
    }
}
