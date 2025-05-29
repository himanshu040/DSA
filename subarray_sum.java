import java.util.HashMap;
import java.util.Map;

class SubArraySum{
  
    public static void main(String[] args) {

        int[] nums= {1,2,3,4,5};
       int value= subarraySum(nums,3);
       System.out.println(value);
         
    }

     public static int subarraySum(int[] nums, int k) {

          Map<Integer,Integer> ma=new HashMap<>();
        int presum=0;
        int cnt=0;
        ma.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
         presum+=nums[i];
            cnt=cnt+ma.getOrDefault(presum-k,0);
         ma.put(presum,ma.getOrDefault(presum,0)+1);
        }
       
       
        return cnt;
        
    }

} 