class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int weight[], int values[], int n) 
    { 
          int dp[][]=new int[n+1][W+1];
          for(int i=0;i<=n;i++)
          {
              for(int j=0;j<=W;j++)
              {
                  if(i==0 || j==0)
                  dp[i][j]=0;
              }
          }
          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=W;j++)
              {
                  if(weight[i-1]<=j)
                  dp[i][j]=Math.max(dp[i-1][j-weight[i-1]]+values[i-1],dp[i-1][j]);
                  else
                  dp[i][j]=dp[i-1][j];
              }
          }
          return dp[n][W];
    } 
}


