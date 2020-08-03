class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {    int x=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
               int y=nums[j];
                 int d=x^y;
                max=Math.max(d,max);
                y=0;
            }
        }
        return max;
        
    }
}