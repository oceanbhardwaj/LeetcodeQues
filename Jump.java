/*class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(max_reach<i+nums[i])
                max_reach=i+nums[i];
            if(i==max_reach)
                break;
        }
        return max_reach>=nums.length-1;
    }
}*/
