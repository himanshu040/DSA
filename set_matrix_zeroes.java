/*
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

import java.util.Arrays;

public class set_matrix_zeroes {

    public static void main(String[] args) {
        int[][]  matr = 
        {{0,1,2,0},
        {3,4,5,2},
        {1,3,1,5}};
        setZeroesOptimal(matr);
        for (int[] matr1 : matr) {
            System.out.println(Arrays.toString(matr1));
        }
    }

    public static void setZeroes(int[][] matrix) {





        int n=matrix.length;
        int m=matrix[0].length;
        int[] row=new int[n];
        int[] col=new int[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                   matrix[i][j]=0;
                }
            }
        }
    }

    public static void setZeroesOptimal(int[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;
        // int[] row=new int[n];
        // int[] col=new int[m];
        int col0=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    if(j==0)
                    {
                        col0=0;
                    }
                    else{
                        matrix[0][j]=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[i][0]==0||matrix[0][j]==0)
                {
                   matrix[i][j]=0;
                }
            }
        }
         if(matrix[0][0]==0)
        {
            for(int j=1;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(col0==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }

    }
    
}
