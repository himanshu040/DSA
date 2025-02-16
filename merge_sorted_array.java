import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class merge_sorted_array {

    public static void main(String[] args) {
       int a[] ={-7,8}, b[] = {-8,-3,8};

       ArrayList<Integer> union= SolutionMerged.twoPointer(a,b);
     
       System.out.println(union);

    }

  
    
}

class SolutionMerged {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        
        ArrayList<Integer> Union= new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
        }

        for(int i=0;i<b.length;i++)
        {
            map.put(b[i],map.getOrDefault(b[i], 0)+1);
        }

        for(int i : map.keySet())
        {
            Union.add(i);
        }
        return Union;

    }


    public static ArrayList<Integer> findUnionSet(int a[], int b[]) {
        // add your code here
        
        ArrayList<Integer> Union= new ArrayList<Integer>();
        SortedSet<Integer> set=new TreeSet<Integer>();
        
        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        for(int i=0;i<b.length;i++)
        {
            set.add(b[i]);
        }

        for(int i : set)
        {
            Union.add(i);
        }
        return Union;

    }

    public static ArrayList<Integer> twoPointer(int a[], int b[]) {
        // add your code here
       

        ArrayList<Integer> Union= new ArrayList<Integer>();

        int i=0,j=0;
        
        while(i<a.length&&j<b.length)
        {
            if(a[i]<=b[j])
            {
                if(Union.size()==0||Union.get(Union.size()-1)!=a[i])
                {
                    Union.add(a[i]);
                }
                i++;
            }
            else{

                if(Union.size()==0||Union.get(Union.size()-1)!=b[j])
                {
                    Union.add(b[j]);
                }
                j++;

            }
        }

        while(i<a.length)
        {
            if(Union.size()==0||Union.get(Union.size()-1)!=a[i])
            {
                Union.add(a[i]);
            }
            i++;
        }

        while(j<b.length)
        {
            if(Union.size()==0||Union.get(Union.size()-1)!=b[j])
            {
                Union.add(b[j]);
            }
            j++;
        }
      
        return Union;

    }


}



