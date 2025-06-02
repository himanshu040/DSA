/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]] */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pascal {

    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        int n=ac.nextInt();
        List<List<Integer>> ans= generate(n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i).toString());
        }
        
        ac.close();
    }
    
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            result.add(nCr(i+1));
        }
        return result;
        
    }

     static List<Integer> nCr(int row)
     {
        int ans=1;
        List<Integer> col=new ArrayList<>();
        col.add(ans);
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i);
            ans=ans/i;
            col.add(ans);
        }
        return col;

     }

}