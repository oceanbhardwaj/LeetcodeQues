class Solution {
    public boolean findPartition(int[] a, int n) {
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+a[i];
        int d=sum/2;
        if((sum%2)!=0)
        return false;
        else
        return Subsetsum(a,d,n);
         
    }
    static  boolean Subsetsum(int a[],int amount,int n)
{  boolean dp[][]=new boolean[n+1][amount+1];
for(int i=0;i<=n;i++)
{
    for(int j=0;j<=amount;j++)
    {
        if(i==0)
        dp[i][j]=false;
        if(j==0)
        dp[i][j]=true;
    }
}
    for(int i=1;i<=n;i++)
{
    for(int j=1;j<=amount;j++)
    {
        if(a[i-1]<=j)
        dp[i][j]=(dp[i-1][j-a[i-1]] || dp[i-1][j]);
        else
        dp[i][j]=dp[i-1][j];
    }
}
return dp[n][amount];
    
    
    
    
}



}