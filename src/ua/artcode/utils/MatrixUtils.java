package ua.artcode.utils;

import ua.artcode.week2.method.ArrayUtils;

/**
 * Created by serhii on 05.03.16.
 */
public class MatrixUtils {

    public static String toString(int[][] mat){
        if(mat == null){
            return "wrong argument, mat is null";
        }

        if(mat.length == 0){
            return "empty matrix";
        }

        String matRes = "";

        // row
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }
        
        return matRes;
    }

    public static int[][] genMatrixOddEven(int size){
        int[][] mat = new int[size][size];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                int rand = ArrayUtils.genRandomNum(100);
                if(i % 2 == 0){
                    mat[i][j] = rand % 2 == 0 ? rand : rand + 1;
                } else {
                    mat[i][j] = rand % 2 == 0 ? rand + 1 : rand;
                }

                /*mat[i][j] = i % 2 == 0 ?
                                (rand % 2 == 0 ? rand : rand + 1) :
                                (rand % 2 == 0 ? rand + 1 : rand);  */
            }
        }

        return mat;
    }

    public static int[][] genMatrixOddEven2(int size){
        int[][] mat = new int[size][size];

        for (int i = 0; i < mat.length; i++) {
            mat[i] = i % 2 == 0 ? ArrayUtils.genRandomMasEvenNum(size,100) :
                                    ArrayUtils.genRandomMasOddNum(size,100);
        }

        return mat;
    }

}
