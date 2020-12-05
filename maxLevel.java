class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxlevel=1;
        int max=Integer.MIN_VALUE;
            int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            count++;
            int sum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                sum=sum+curr.val;
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                  q.add(curr.right);
            }
            if(sum>max)
            {
                maxlevel=count;
                max=sum;
            }
        }
        return maxlevel;
        
    }
}