class Solution {
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        if(customers.length==0)
            return 0;
        int sum=0;
        int count=0;
        int left=0;
        int ans=0;
        int d=0;
        int max=-1;
        for(int i=0;i<customers.length;i++)
        {    
            
             left+=customers[i];
            
            
           
            if(left>4)
            { left=left-4;
            sum=sum+4;}
            else
            {sum=sum+left;
             left=0;}
             
             
            count++;
             d=sum*boardingCost-count*runningCost;
            if(d>max)
            {max=Math.max(max,sum*boardingCost-count*runningCost);
             ans=count;}
        }
        while(left>0)
        {
            if(left>4)
            { left-=4;
            sum+=4;}
            else
            {
                sum+=left;
                left=0;
            }
            count++;
            d=sum*boardingCost-count*runningCost;
            if(d>max)
            {max=Math.max(max,sum*boardingCost-count*runningCost);
             ans=count;}
             //max=Math.max(max,sum*boardingCost-count*runningCost);
        }
        if(max<0)
            return -1;
        else
            return ans;
    }
}