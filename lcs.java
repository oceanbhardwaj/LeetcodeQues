import java.util.*;
class lcs
{ 
	public static void main(String[] args) {
		String X="accabcdyyd";
		String Y="aycccydyyd";

		int n=X.length();
		int m=Y.length();
		int dp[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=m;j++)
			{
				dp[i][j]=-1;
			}
		}
		System.out.println(LCS(X,Y,n,m,dp));
	}
	static public int LCS(String X,String Y,int n,int t,int dp[][])
	{
		if(n==0 || t==0)
			return 0;
  if(dp[n][t]!=-1)
  	return dp[n][t];
		if(X.charAt(n-1)==Y.charAt(t-1))
			return dp[n][t]=1+LCS(X,Y,n-1,t-1,dp);
		else
			return dp[n][t]=Math.max(LCS(X,Y,n,t-1,dp),LCS(X,Y,n-1,t,dp));
	}

	
}