/*package whatever //do not write package name here */

class Solution {
    public int editDistance(String s, String t) {
        return dfs(s,t,s.length(),t.length());
    }
    public int dfs(String X,String Y,int m,int n)
    {
        if(m<=0 )
        return n;
        if(n<=0)
        return m;
        if(X.charAt(m-1)==Y.charAt(n-1))
        {
            return dfs(X,Y,m-1,n-1);
        }
        else
        {
            return 1+Math.min(dfs(X,Y,m,n-1),Math.min(dfs(X,Y,m-1,n-1),dfs(X,Y,m-1,n)));
        }
    }
}
///////////////////////////////////////////////////////////
class Solution {
    public int editDistance(String s, String t) {
        int n=s.length();
        int m=t.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=i;
            
        }
        for(int i=0;i<=m;i++)
        {
            dp[0][i]=i;
            
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                dp[i][j]=dp[i-1][j-1];
                else
                dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]));
            }
        }
        return dp[n][m];
    }
}