import java.util.Scanner;

public class maximaum_sum_subarray_kaddens_algo {
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
        System.out.println(maxSubArray(arr));

    }

     public static int maxSubArray(int[] nums) {

        int maxSum=nums[0];
        int sum=0;
         int start = 0, end = 0, tempStart = 0;

    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];

        if (sum > maxSum) {
            maxSum = sum;
            start = tempStart;
            end = i;
        }

        if (sum < 0) {
            sum = 0;
            tempStart = i + 1; // next index might be the start of a new subarray
        }
    }

    // Print the subarray and its indices
    System.out.println("Max Subarray Sum: " + maxSum);
    System.out.println("Start Index: " + start);
    System.out.println("End Index: " + end);
    System.out.print("Subarray: [");
    for (int i = start; i <= end; i++) {
        System.out.print(nums[i]);
        if (i < end) System.out.print(", ");
    }
    System.out.println("]");
        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        //     maxSum=Math.max(maxSum,sum);
        //     if(sum<0)
        //     {
        //         sum=0;
        //     }
        // }
        return maxSum;
        
    }

}
