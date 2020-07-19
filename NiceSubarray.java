class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int pre[]=new int[nums.length];
        int odd=0;
        int cnt=0;
        for(int i =0;i<nums.length;i++)
        {
            pre[odd]++;
        
        if(nums[i]%2==1)
            odd++;
            
            if(odd>=k)
                cnt=cnt+pre[odd-k];}
        return cnt;
                
            
    }
}