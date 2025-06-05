/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105 
 * 
 * 
 * 
 * 
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class three_sum {

     public static void main(String[] args) {

        int[] nums= {-1,0,1,2,-1,-4};
      List<List<Integer>> ans=  threeSumOpt(nums);
       for(int i=0;i<ans.size();i++)
       {
        System.out.print(ans.get(i)+" ");
       }


        
    }

     public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer> temp=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int k=-(nums[i]+nums[j]);
                if(temp.contains(k))
                {
                  List<Integer> triplet=new ArrayList<>();
                  triplet.add(nums[i]);
                  triplet.add(nums[j]);
                  triplet.add(k);
                  triplet.sort(null);
                  st.add(triplet);
                }
                else
                {
                    temp.add(nums[j]);
                }
            }
        }

        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(st);

        return ans;
        
    }
    public static List<List<Integer>> threeSumOpt(int[] arr) {

        List<List<Integer>> ans=new ArrayList<>();
        int n= arr.length;
       Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if(arr[i]>0) break;
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
        
    }

    
}
