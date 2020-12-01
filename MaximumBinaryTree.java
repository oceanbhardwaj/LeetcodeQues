class Solution {
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return call(nums,0,nums.length-1);
        
        
    }
    public TreeNode call(int nums[],int start,int end)
    { if(start<0 || end>nums.length-1 || start>end)
        return null;
        int d=findMaxIndex(nums,start,end);
        TreeNode root=new TreeNode(nums[d]);
        root.left=call(nums,start,d-1);
        root.right=call(nums,d+1,end);
        return root;
    }
    public int findMaxIndex(int nums[],int start,int end)
    {
        int maxindex=0;
        int maxvalue=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>maxvalue)
            {
                maxindex=i;
                maxvalue=nums[i];
            }
        }
        return maxindex;
        
            
    }
}