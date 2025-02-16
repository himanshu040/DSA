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
        boolean r=SolutionBinary.searchInSorted(arr, k);
        if(r==true)
        {
            System.out.printf("%d is present in array", k);
        }
        else
        {
            System.out.printf("%d is not4 present in array", k);

        }


    }
    
}


class SolutionBinary {
    static boolean searchInSorted(int arr[], int k) {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return true;
            }
        }
        return false;
        // Your code here
    }
}