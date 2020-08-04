class Solution {
    public int integerReplacement(int n) {
        if(n==0)
            return 1;
        int count=0;
        while(n!=1)
        {
            if(( n&1)!=1)
            {
                n=n>>1;
                count++;
            }
            else if(n==3 || Integer.bitCount(n+1)>Integer.bitCount(n-1))
            { 
                n=n-1;
                count++;
            }
            else
            {
                n=n+1;
                count++;
            }
        }
        return count;
        
    }
}