class Solution{
    static String longestPalin(String S){
       int n=S.length();
       boolean dp[][]=new boolean[n][n];
       int start=0;
       int end=0;
       //int ans="";
       int len=0;
       //one length
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n;j++)
           {
               if(i==j)
               {
                   dp[i][j]=true;
                   
                   if(1>len)
                   {
                       len=1;
                       start=i;
                   end=j;
                       
                   }
                   
               }
           }
       }
       //len two
       for(int i=0;i<n-1;i++)
       {
           if(S.charAt(i)==S.charAt(i+1))
           {
               dp[i][i+1]=true;
               if(len<2)
               {
                   start=i;
                   end=i+1;
                   len=2;
                   
               }
           }
       }
       //more than 2
       for(int k=3;k<=n;k++)  //len loop
       {
           for(int i=0;i<=n-k;i++) //start
           {
               int beg=i;
               int ending=i+k-1;
               if(S.charAt(beg)==S.charAt(ending) && dp[beg+1][ending-1])
               {
                   dp[beg][ending]=true;
                   if(len<k)
                   {
                       start=beg;
                       end=ending;
                       len=k;
                   }
               }
           }
       }
       return S.substring(start,end+1);
        
    }
}