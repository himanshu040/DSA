/*
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * 
 * 
 */



import java.util.Arrays;

public class rotate_2D_array {
      public static void main(String[] args) {
        int[][]  matr = 
        {{0,1,2},
        {3,4,5},
        {1,3,1}};
        rotate(matr);
        for (int[] matr1 : matr) {
            System.out.println(Arrays.toString(matr1));
        }
    }
     public static void rotate(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;

        // traversing and swapping alternately
        for (int i=0; i<col; i++) {
            for (int j=i; j<row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reversing
        for (int i=0; i<col; i++) {
            for (int j=0; j<(row/2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-1-j];
                matrix[i][row-1-j]=temp;
            }
        }
    }
    
}
