class Solution {
    public int[] singleNumber(int[] nums) {
        int sum=nums[0];
        int arr[]=new int[2];
        for(int i=1;i<nums.length;i++)
        {
            sum=sum^nums[i];
        }
        int set=sum & ~(sum-1);
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]&set)!=0)
            {
                x=x^nums[i];
            }
            else
                y=y^nums[i];

        }
        arr[0]=x;
        arr[1]=y;
        
        return arr;
    }
}