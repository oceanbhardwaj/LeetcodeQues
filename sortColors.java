class Solution {
    public void sortColors(int[] nums) {
        /* O(nlogn)
        Arrays.sort(nums);
        */
        
        /* o(n) 
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                count0++;
            else if(nums[i]==1)
                count1++;
            else
                count2++;
        }
        for(int i=0;i<count0;i++)
        {
            nums[i]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
           nums[i]=1;
        
        }
        for(int i=count0+count1;i<nums.length;i++)
        {
            nums[i]=2;
        }
        */
        
        /* method 3  three pointers algo*/
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
           if(nums[mid]==0)
           {
               swap(low,mid,nums);
               mid++;
               low++;
           }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(mid,high,nums);
                high--;
            }
        }
        
        
        
        
    }
    public void swap(int start,int end,int nums[])
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}