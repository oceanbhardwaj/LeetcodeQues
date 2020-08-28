class Solution {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
       int ans=  helper(s,0,dp);
        return ans;
        
    }
    public static int helper(String s,int index,int dp[])
    {
        if(index==s.length())
            return 1;
        if(s.charAt(index)=='0')
            return 0;
        if(index==s.length()-1)
            return 1;
        if(dp[index]>0)
            return dp[index];
        int way1=helper(s,index+1,dp);
        int way2=0;
        int d=Integer.parseInt(s.substring(index,index+2));
       
        if(d>=10 && d<=26)
             way2=helper(s,index+2,dp);
        return dp[index]=way1+way2;
    }
    
}