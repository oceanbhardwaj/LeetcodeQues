class Solution {
 
   public int numWaterBottles(int numBottles, int numExchange) {

        int sum=numBottles;
  
      int blank=numBottles;
    
    int mod=0;
     
   int d=0;
        
while(blank>=numExchange)
    
    {
            d=blank/numExchange;
        
    mod=blank%numExchange;
         
   sum+=d;
        
    blank=d+mod;
      
  }
       
 return sum;
        
    }
}