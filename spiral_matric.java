import java.util.ArrayList;
import java.util.List;

public class spiral_matric {


      public static void main(String[] args) {
        int[][]  matr = 
        {{0,1,2},
        {3,4,5},
        {1,3,1}};
       List<Integer> in= spiralOrder(matr);
           System.out.println(in);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int left=0;
        int right=col-1;
        int bottom=row-1;

while(left<=right&&top<=bottom)

       { 
        for(int i=left;i<=right;i++)
        {
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
      {   for(int i=right;i>=left;i--)
        {
            result.add(matrix[bottom][i]);
        }
        bottom--;}
         for(int i=bottom;i>=top;i--)
        {
            result.add(matrix[i][left]);
        }
        left++;
}
return result;

        
    }
    
}
