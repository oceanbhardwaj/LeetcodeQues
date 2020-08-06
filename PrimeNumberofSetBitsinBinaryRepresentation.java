class Solution {
    public int countPrimeSetBits(int L, int R) {
        int ans=0;
       for(int i=L;i<=R;i++)
       {
           int d=CountBits(i);
           if(isPrime(d))
               ans++;
       }
        return ans;
     }
    static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        if(n==2)
            return true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    
    static int CountBits(int n)
    {
        int count=0;
        while(n>0)
        {
           n=n&(n-1);
            count++;
        }
        return count;
    }
}