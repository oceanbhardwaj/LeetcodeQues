class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++)
        {
           
            int left=i+1;
            int right=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            while(left<right)
            {
               if(nums[left]+nums[right]+nums[i]==0)
               {
                   res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                  int val=nums[left];
                   int val2=nums[right];
                   while(left<right && nums[left]==val)
                       left++;
                  while(left<right && nums[right]==val2)
                      right--;
                  
                  
               }
                else if(nums[left]+nums[right]+nums[i]>0)
                    right--;
                else
                    left++;
                    
            }
        }
        return res;
    }
}