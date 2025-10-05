import java.util.Scanner;

public class binary_search {

    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);

        System.out.print("Enter Length: ");

        int n=ac.nextInt();
        System.out.print("Enter Array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ac.nextInt();
        }
        System.out.print("Enter number to find: ");
        int k=ac.nextInt();
        int r=SolutionBinary.searchInSorted(arr, k);
        if(r!=-1)
        {
            System.out.printf("%d is present in array at %d", k, r);
        }
        else
        {
            System.out.printf("%d is not present in array", k);

        }
       ac.close();

    }
    
}


class SolutionBinary {
    static int searchInSorted(int nums[], int target) {
        
        int s=0;
       int e=nums.length-1;

       while(s<=e)
       {
          int mid = s + (e - s) / 2;

        if(nums[mid]==target)
        {
            return mid;
        }
          
          if(nums[mid]<target)
          {
            s=mid+1;
          }
          else
          {
            e=mid-1;
          }

        

       }

    return -1;
        // Your code here
    }
}