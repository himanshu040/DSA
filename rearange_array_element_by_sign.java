/*
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 * 
 */



import java.util.Arrays;
import java.util.Scanner;

public class rearange_array_element_by_sign {

      public static void main(String[] args) {
         Scanner ac=new Scanner(System.in);

        System.out.print("Enter Length: ");

        int n=ac.nextInt();
        System.out.print("Enter Array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=ac.nextInt();        
            arr[i]=num;
        }
       ac.close();
        System.out.println(Arrays.toString(rearrangeArray(arr)));

    }
  public static int[] rearrangeArray(int[] nums) {

        int n=nums.length;

        int[] arrayRes=new int[n];
        // int[] arraypos=new int[n];

        int i=0;
        int j=1;

        for(int k=0;k<n;k++)
        {
            if(nums[k]<0)
            {
                arrayRes[j]=nums[k];
                j=j+2;
            }
            else
            {
                arrayRes[i]=nums[k];
                i=i+2; 
            }
        }

        // for(int k=0;k<n;k++)
        // {
        //     if(nums[k]<0)
        //     {
        //         arrayneg[i]=nums[k];
        //         i++;
        //     }
        //     else   
        //     {
        //         arraypos[j]=nums[k];
        //         j++;
        //     }
        // }
        // i=0;
        // j=0;

        // for(int k=0;k<n;k++) 
        // {
        //     if(k%2==0)
        //     {
        //         nums[k]=arraypos[i++];
        //     }
        //     else
        //     {
        //         nums[k]=arrayneg[j++];
        //     }
        // }

        return arrayRes;
        
        
    }


    
}
