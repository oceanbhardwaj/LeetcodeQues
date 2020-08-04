class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int d=count(nums[i],nums[j]);
                    sum=sum+d;
            }
        }
        return sum;
    }
    static int count(int n1,int n2)
    {
        int x=0;
        for(int i=0;i<32;i++)
        {
            if((n1 &(1<<i))!=(n2 & (1<<i)))
                x++;
        }
        
        return x;
        
        
        
    }
}