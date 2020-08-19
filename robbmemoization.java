class Solution {
   static int dp[];
    public int rob(int[] nums) {
        dp=new int[nums.length];
        return helper(nums,0);
        
    }
    static int helper(int[]nums,int i)
    {
        if(i>nums.length-1)
            return 0;
        if(dp[i]!=0)
            return dp[i];
        int buy=helper(nums,i+2)+nums[i];
        int nobuy=helper(nums,i+1);
        return dp[i]= Math.max(buy,nobuy);
    }
}