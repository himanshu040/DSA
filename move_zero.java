public class move_zero {

    public static void main(String[] args) {
        
        int[] nums={0,1,0,3,12};
        SolutionMove solution=new SolutionMove();
        
        solution.moveZeroes(nums);

       for(int i=0;i<5;i++)
       {
        System.out.println(nums[i]);
       }

    }
    
}

class SolutionMove {
    public void moveZeroes(int[] nums) {

        int n=nums.length;
        int[] arr=new int[n];
        int j=0;
        int i=0;

        for( i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                arr[j]=nums[i];
                j++;
            }
        }

       while(j<n)
       {
        arr[j]=0;
        j++;
       }

      for(i=0;i<n;i++)
      {
        nums[i]=arr[i];
      }



        
    }
}