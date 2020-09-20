class Solution {
    public int maxProfit(int[] prices, int fee) {
      
        int n=prices.length;
       HashMap<String,Integer> h=new HashMap<String,Integer>();
        return call(0,0,prices,h,fee);
        
    }
    static int call(int i,int buyorsell,int prices[],HashMap<String,Integer> h,int fee)
    {
        if(i>=prices.length)
            return 0;
        String s=i+"code"+buyorsell;
        if(h.containsKey(s))
            return h.get(s);
        int x=0;
        if(buyorsell==0)
        {
            int buy=call(i+1,1,prices,h,fee)-prices[i];
            int nobuy=call(i+1,0,prices,h,fee);
            x=Math.max(buy,nobuy);
            
            
        }
        else
        {
           int sell=call(i+1,0,prices,h,fee)+prices[i]-fee;
            int nosell=call(i+1,1,prices,h,fee);
            x=Math.max(sell,nosell);
            
            
            
        }
        h.put(s,x);
        return x;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}