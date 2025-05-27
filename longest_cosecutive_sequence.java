/*
 * 
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 * 
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class longest_cosecutive_sequence {

      public static void main(String[] args) {
        int[] array = {3,2,1,100,200,5,4,3,6};
       longestConsecutive(array);
        System.out.println( longestConsecutive(array));
    }
      public static int longestConsecutive(int[] nums) {

        // Arrays.sort(nums);
        //  if(nums.length==0)
        // {
        //    return 0;
        // }
        // int maxLength=1;
        // int length=1;
       
        // for(int i=1;i<nums.length;i++)
        // {
         
        //  if(nums[i]==nums[i-1])
        //  {
        //     continue;
        //  }

        //   if(nums[i]-nums[i-1]==1)
        //   {
        //     length++;
        //   }
        //   else
        //   {
        //     length=1;
        //   }
        //   maxLength=Math.max(maxLength,length);

        // }
        // return maxLength;
        //  Map<Integer,Integer> ranges = new HashMap<>();
        // int max = 0;
        // for (int num : nums) {
        //     if (ranges.containsKey(num)) continue;
            
        //     // 1.Find left and right num
        //     int left = ranges.getOrDefault(num - 1, 0);
        //     int right = ranges.getOrDefault(num + 1, 0);
        //     int sum = left + right + 1;
        //     max = Math.max(max, sum);
            
        //     // 2.Union by only updating boundary
        //     // Leave middle k-v dirty to avoid cascading update
        //     if (left > 0) ranges.put(num - left, sum);
        //     if (right > 0) ranges.put(num + right, sum);
        //     ranges.put(num, sum); // Keep each number in Map to de-duplicate
        // }
        // return max;

        Set<Integer> set = new HashSet<>();
        int cnt=0;
        int longest=1;
        if(nums.length==0){
        return 0;}

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int it:set)
        {
            if(!set.contains(it-1))
            {
                cnt=1;
                int x=it;
                while(set.contains(x+1))
                {
                    cnt+=1;
                   
                    x=x+1;
                }

                longest=Math.max(longest,cnt);

            }

          
        }
        return longest;
        
    }
    
}