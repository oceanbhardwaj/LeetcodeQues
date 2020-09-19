class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
       HashMap<String,Integer> h=new HashMap<String,Integer>();
        return call(0,0,prices,h);
        
    }
    static int call(int i,int buyorsell,int prices[],HashMap<String,Integer> h)
    {
        if(i>=prices.length)
            return 0;
        String s=i+"code"+buyorsell;
        if(h.containsKey(s))
            return h.get(s);
        int x=0;
        if(buyorsell==0)
        {
            int buy=call(i+1,1,prices,h)-prices[i];
            int nobuy=call(i+1,0,prices,h);
            x=Math.max(buy,nobuy);
            
            
        }
        else
        {
           int sell=call(i+2,0,prices,h)+prices[i];
            int nosell=call(i+1,1,prices,h);
            x=Math.max(sell,nosell);
            
            
            
        }
        h.put(s,x);
        return x;
        
        
        
        
        
        
        
        
        
        
        
        
    }
}