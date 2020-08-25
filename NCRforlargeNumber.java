import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	for(int i1=0;i1<t;i1++)
	{
	    String s=sc.nextLine();
	    String []str=s.split(" ");
	    int n=Integer.parseInt(str[0]);
	    int k=Integer.parseInt(str[1]);
	    
	   int dp[][]=new int[1001][1001];
	    for(int i=0;i<=n;i++)
	    {
	        for(int j=0;j<=k;j++)
	        {
	            if(j==0)
	            dp[i][j]=1;
	            
	        }
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {  
	            dp[i][j]=(dp[i-1][j-1]%(int)(1e9+7)+dp[i-1][j]%(int)(1e9+7));
	    
	    
	    
	    
	}
	}
	System.out.println(dp[n][k]%(int)(1e9+7));
	
}}}