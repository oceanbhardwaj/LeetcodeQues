class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int sm=0;
        int max=0;
        int sum=0;
        int n=customers.length;
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==0)
                sum=sum+customers[i];
        }
        
       int d=sum;
        for(int i=0;i<=n-X;i++)
        { sum=d;
            for(int j=0;j<X;j++)
                
            {
                if(grumpy[i+j]==1)
                    sum=sum+customers[j+i];
            }
            max=Math.max(max,sum);
            
            
            
        }
        return max;
        
    }
}