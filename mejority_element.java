/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

import java.util.HashMap;
import java.util.Scanner;

class MejorityElement{
 
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
        System.out.println(majorityElementOpt(arr));

    }


     public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> count=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<nums.length;i++)
         {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

         }

       
         for (Integer i : count.keySet()) {
                  
                  if(count.get(i)>n/2)
                  {
                   return i;
                  }
    }
    return -1;
}

public static int majorityElementOpt(int[] nums) {

        int count=0;
        int element=0;
        int n=nums.length;

        for(int i=0;i<nums.length;i++)
         {
            if(count==0)
            {
                 count=1;
                element=nums[i];
            }
         else if(element==nums[i])
         {
            count++;
         }
         else count--;

         }
      int elemnt2=0;
      for(int i=0;i<n;i++)
      {
        if(element==nums[i])
        {
            elemnt2++;
        }
      }  
      
      if(elemnt2>n/2)
      {
        return element;
      }
     
    
    return -1;
}




}