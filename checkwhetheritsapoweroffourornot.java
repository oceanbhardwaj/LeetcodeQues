class Solution {
    public boolean isPowerOfFour(int num) {
      /* if(num!=0 && (num & (num-1))==0 && (num & 0xAAAAAAAA)==0)
           return true;
        else 
            return false;*/
        int count=0;
    int x=num &(num-1);
        if(x==0 && num>0)
        {
            while(num>1)
            {
                count++;
                num=num>>1;
            }
            if(count%2==0)
                return true;
            
        }
        return false;
        
        
        
        
        
        
    }
}