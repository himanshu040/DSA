 class string_to_int {

     
    public int atoi(String s)
    {
         if(s==null || s.length()==0)
        {
            return 0;

        }

        final int INT_MAX=Integer.MAX_VALUE;
        final int INT_MIN= Integer.MIN_VALUE;
       
        int i=0;
        int sign=1;
        int n=s.length();
        
        while(i<n&&s.charAt(i)==' ')
        {
            i++;
        }
        if(i==n)
        {
            return 0;
        }

        if(s.charAt(i)=='+')
        {
            i++;
        }
        else if(s.charAt(i)=='-')
        {
            i++;
            sign=-1;
        }

        long res=0;

        while(i<n&&Character.isDigit(s.charAt(i)))
        {
           int d=s.charAt(i)-'0';
           res=res*10+d;

           if(sign*res<=INT_MIN)
           {
            return INT_MIN;
           }
             if(sign*res>=INT_MAX)
           {
            return INT_MAX;
           }

           i++;

           

        }
       return (int)(res * sign);   
    }

    
}