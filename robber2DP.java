class Solution {
    public int rob(int[] nums) {
         if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(helper(nums,0,nums.length-2),helper(nums,1,nums.length-1));
        
    }
    static int helper(int nums[],int index,int length)
    {
       int dp[]=new int[nums.length];
       
        dp[index]=nums[index];
        dp[index+1]=Math.max(nums[index+1],nums[index]);
        for(int i=index+2;i<=length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[length];
        
        
        
        
        
        
    }
}