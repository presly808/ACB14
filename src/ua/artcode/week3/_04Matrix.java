package ua.artcode.week3;

import ua.artcode.utils.MatrixUtils;

public class _04Matrix {


    public static void main(String[] args) {
        int[] row1 = {1,2,3};
        int[] row2 = {1,2,3};
        int[] row3 = {1,2,3};

        int[][] matrix = {row1,row2,row3};

        int[][] mat3 = new int[4][3];

        int[] r1 = mat3[0];
        int el = mat3[1][0];

        int[][] table = {   {1,2,3,3,3,3,3,3},
                            {4,5,6},
                            {7,8,9,10,11,12}
                        };



        String res = MatrixUtils.toString(matrix);
        System.out.println(res);
    }
}
