public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        
      /*  while(n!=0)  //method1
        {
            n=n &(n-1);
            count++;
        }*/
        
       /* while(n!=0) //method 2
        {
            count+=n&1;
            n=n>>>1;
        }
        */
        
        
        for(int i=0;i<32;i++)
        {
            if((n & 1<<i)!=0)
                count++;
        }
        
        
        
        
        
        return count;
        
    }
}