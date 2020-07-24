class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        
        
        int n=customers.length;
        int max=0;
        int sum=0;
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==0)
                sum=sum+customers[i];       
        }
        
        for(int i=0;i<X;i++)
        {
            if(grumpy[i]==1)
                d=d+customers[i];
               
        }
        sum=sum+d;
        max=Math.max(sum,max);
        for(int i=X;i<n;i++)
        {
           if(grumpy[i-X]==1)
               sum=sum-customers[i-X];
            if(grumpy[i]==1)
               sum=sum+customers[i];
            max=Math.max(max,sum);
            
            
        }
        return max;
        
        
        
        
        
        
        
        
    }
}