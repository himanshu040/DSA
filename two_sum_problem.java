/*Problem statement
Sam want to read exactly ‘TARGET’ number of pages.

He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

Example:
Input: ‘N’ = 5, ‘TARGET’ = 5
‘BOOK’ = [4, 1, 2, 3, 1] 

Output: YES
Explanation:
Sam can buy 4 pages book and 1 page book.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5 5
4 1 2 3 1
Sample Output 1 :
YES
Explanation Of Sample Input 1:
Sam can buy 4 pages book and 1-page book.
Sample Input 2:
2 1
1 2
Sample Output 2 :
NO
Expected Time Complexity:
O( N ), Where N is the length of the array.
Constraints:
1  <= N <= 10^3
1 <= BOOK[i], TARGET <= 10^6
Time Limit: 1 sec */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class two_sum_problem {



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
        System.out.print("Enter Target: ");
        int target=ac.nextInt();
        System.out.println(read(n,arr,target));

    }
     public static String read(int n, int []book, int target){
        // Write your code here.
          Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int remain = target - book[i];
            if (seen.contains(remain)) {
                return "YES";
            }
            seen.add(book[i]);
        }
        return "NO";

    }
    
}
