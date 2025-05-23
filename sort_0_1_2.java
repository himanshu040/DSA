import java.util.Arrays;
import java.util.Scanner;

public class sort_0_1_2 {

    
    public static void main(String[] args) {
         Scanner ac=new Scanner(System.in);

        System.out.print("Enter Length: ");

        int n=ac.nextInt();
        System.out.print("Enter Array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int num=ac.nextInt();
            while(num!=0&&num!=1&&num!=2)
            {
                System.out.println("enter number should be 0,1,2");
                num=ac.nextInt();
            }
            
            arr[i]=num;
        }
       ac.close();
        sortColors(arr);

    }

    public static void sortColors(int[] nums) {
       int low=0, mid=0, high=nums.length-1;

       while(mid<=high)
       {
           if(nums[mid]==2)
           {
             int temp=nums[mid];
             nums[mid]=nums[high];
             nums[high]=temp; 
             mid++;
             high--;
           }
           else if(nums[mid]==1)
           {
            mid++;
           }
           else
           {
              int temp=nums[mid];
             nums[mid]=nums[low];
             nums[low]=temp; 
             mid++;
             low++;
           }
       }
       System.out.println(Arrays.toString(nums));
         
    }
    
}
