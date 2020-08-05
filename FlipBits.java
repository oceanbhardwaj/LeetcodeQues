class Solution {
    public int minFlips(int a, int b, int c) {
        int count=0;
        int val=0;
        int d=0;
        int e=0;
  for(int i=0;i<32;i++)
   {   
       val=(c>>i)&1;
        d=(a>>i)&1;
        e=   (b>>i)&1;     

      if(val==0)
      {
          if(d==1 && e==1)
              count+=2;
          else if(d==1 || e==1)
              count++;
      }
      else 
      {
          if(d==0 && e==0)
              count++;
          
          
      }
  }
        return count;
    }
}
          
          
          
          
          
      
          
          
          
          
          
          
      
    
    
    
    
    
    
    
    
    
    
    
    