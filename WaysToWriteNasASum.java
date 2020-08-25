import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		    int n=sc.nextInt();
		    int amount=n;
		    int arr[]=new int[n-1];
		    for(int j=1;j<=arr.length;j++)
		    {
		        arr[j-1]=j;
		    }
		    long dp[][]=new long[arr.length+1][amount+1];
		    for(int i=0;i<=arr.length;i++)
		    {
		        for(int j=0;j<=amount;j++)
		        {
		            if(i==0)
		            dp[i][j]=0;
		            if(j==0)
		            dp[i][j]=1;
		        }
		    }
		    for(int i=1;i<=arr.length;i++)
		    {
		        for(int j=1;j<=amount;j++)
		        {
		            if(arr[i-1]<=j)
		            dp[i][j]=(dp[i][j-arr[i-1]]%(int)(1e9+7)+dp[i-1][j]%(int)(1e9+7))%(int)(1e9+7);
		            else
		            dp[i][j]=dp[i-1][j]%(int)(1e9+7);
		            
		        }
		    }
		    System.out.println(dp[arr.length][amount]%(int)(1e9+7));
		}
	}
}