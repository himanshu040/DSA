class Rotate2dArray {



    public static void main(String[] args) {

        int[] nums= {1,2,3,4,5};
        rotate(nums,2);
       for(int i=0;i<5;i++)
       {
        System.out.print(nums[i]+" ");
       }


        
    }


   static public void rotate(int[] nums, int k) {

       int n=nums.length;
       k=k%n;
        rev(0,n-1,nums);
        rev(0,k-1,nums);
        rev(k,n-1,nums);

        
    }

     static void rev(int currentInd,int lastIndex,int arr[])
    {
        if(currentInd>=lastIndex)
        {
            return;
        }
        
        int temp=arr[currentInd];
        arr[currentInd]=arr[lastIndex];
        arr[lastIndex]=temp;
        rev(currentInd+1,lastIndex-1,arr);
    }
}