// class Solution {
//     public int maxProfit(int k, int[] prices) {
        
//         int n=prices.length;
//        HashMap<String,Integer> h=new HashMap<String,Integer>();
//         return call(0,0,prices,h,k);
        
//     }
//     static int call(int i,int buyorsell,int prices[],HashMap<String,Integer> h,int k)
//     {
//         if(i>=prices.length||k==0)
//             return 0;
//         String s=i+"code"+buyorsell+"bix"+k;
//         if(h.containsKey(s))
//             return h.get(s);
//         int x=0;
//         if(buyorsell==0)
//         {
//             int buy=call(i+1,1,prices,h,k)-prices[i];
//             int nobuy=call(i+1,0,prices,h,k);
//             x=Math.max(buy,nobuy);
            
            
//         }
//         else
//         {
//            int sell=call(i+1,0,prices,h,k-1)+prices[i];r
//             int nosell=call(i+1,1,prices,h,k);
//             x=Math.max(sell,nosell);
            
            
            
//         }
//         h.put(s,x);
//         return x;
        
        
        
        
        
        
        
        
        
        
        
        
    

//     }
// }


class Solution {
    public int maxProfit(int k, int[] prices) {
  if(k==0 || prices.length<=1)
      return 0;
        int sum=0;
        if(k>prices.length/2)   //infinite transactions  part2
        {
            for(int i=0;i<prices.length-1;i++)
            {
                if(prices[i]<prices[i+1])
                    sum=sum+prices[i+1]-prices[i];
            }
           return sum; 
        }
        int n=prices.length;
        int dp[][]=new int[k+1][n];
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<n;j++)
            {
                int max=dp[i][j-1];
                for(int k1=0;k1<j;k1++)
                {
                    int l=dp[i-1][k1];
                    int r=prices[j]-prices[k1];
                    max=Math.max(l+r,max);
                }
                dp[i][j]=max;
            }
        }
            
         return dp[k][n-1];   
            
            
            
            
        
        


        
        
        
        
        
        
            
    }
}





