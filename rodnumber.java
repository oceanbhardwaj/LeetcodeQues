import java.util.*;
class rodnumber
{
	/*public static void main(String[] args) {
		int n=25;
		int a=11;
		int b=12;
		int c=13;
		int dp[]=new int[n+1];
		Arrays.fill(dp,0);
		System.out.println(helper(n,a,b,c,dp));
	}
	static int helper(int n,int a,int b,int c,int dp[])
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		if(dp[n]!=0)
			return dp[n];
		int d=Math.max(1+helper(n-a,a,b,c,dp),1+helper(n-b,a,b,c,dp));
		dp[n]=Math.max(d,1+helper(n-c,a,b,c,dp));
		return dp[n];
	}*/

public static void main(String[] args) {
	int n=5;
	int a=1;
	int b=2;
	int c=3;

	int dp[]=new int[n+1];
	Arrays.fill(dp,-1);
	dp[0]=0;
	for(int i=1;i<=n;i++)
	{
		if(i-a>=0)
			dp[i]=Math.max(dp[i],dp[i-a]);
		if(i-b>=0)
			dp[i]=Math.max(dp[i],dp[i-b]);
		if(i-c>=0)
			dp[i]=Math.max(dp[i],dp[i-c]);
		if(dp[i]!=-1)
			dp[i]++;

	}
	System.out.println(dp[n]);
	
}










}