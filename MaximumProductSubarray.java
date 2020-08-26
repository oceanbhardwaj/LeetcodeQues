class Solution {
    public int maxProduct(int[] nums) {
        int prev_max=nums[0];
        int prev_min=nums[0];
        int msf=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
           int curr_max=Math.max(Math.max(prev_max*nums[i],prev_min*nums[i]),nums[i]);
           int  curr_min=Math.min(Math.min(prev_max*nums[i],prev_min*nums[i]),nums[i]);
            msf=Math.max(curr_max,msf);
            prev_max=curr_max;
            prev_min=curr_min;
        }
        return msf;
        
    }
}