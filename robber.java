class Solution {
    public int rob(int[] nums) {
        return helper(nums,0);
        
    }
    static int helper(int[]nums,int i)
    {
        if(i>nums.length-1)
            return 0;
        int buy=helper(nums,i+2)+nums[i];
        int nobuy=helper(nums,i+1);
        return Math.max(buy,nobuy);
    }
}