/*
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 * 
 * 
 */

import java.util.Arrays;

public class next_permutation {

      public static void main(String[] args) {
        int[] array = {3,2,1};
       nextPermutation(array);
        System.out.println(Arrays.toString(array));
    }
      public static void nextPermutation(int[] nums) {
        
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
          if(nums[i]<nums[i+1])
          {
            index=i;
            break;
          }
        }
        if(index==-1)
        {
            reverseSubArray(nums,0,n-1);
            
        }
        else
        {
            for(int i=n-1;i>=index;i++)
            {
                if(nums[i]>nums[index])
                {
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            reverseSubArray(nums,index+1,n-1);
        }

    }
       public static void reverseSubArray(int[] arr, int start, int end) {
        if (arr == null || arr.length <= 1 || start < 0 || end >= arr.length || start >= end) {
            return; // Handle invalid input
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
}

class Solution {
  
     
}
