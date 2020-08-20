import java.util.*;
class Solution {
    static int dp[]=new int[1001];
    
    public boolean divisorGame(int n) {
        Arrays.fill(dp,-1);
     if( helper(n)==1)
         return true;
        else 
            return false;
    }
    static int helper(int n)
    { 
        if(n==1)
          return 0;
        if(dp[n]!=-1)
            return dp[n];
        else{
            
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(helper(n-i)==0)
                    return dp[n]=1;
                
            }
        }
        return dp[n]=0;
        }
        
    }
}