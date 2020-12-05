class Solution {
    public boolean isCompleteTree(TreeNode root) {
    Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.peek()!=null)
        {
            TreeNode curr=q.poll();
            q.add(curr.left);
            q.add(curr.right);
        }
        while(!q.isEmpty() && q.peek()==null )
            q.poll();
        return q.isEmpty();
}
}
//....................................................................................................................
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int d=getCount(root);
        return dfs(root,0,d);
    }
    public boolean dfs(TreeNode root,int index,int count)
    {
        if(root==null)
            return true;
        if(index>=count)
            return false;
        return dfs(root.left,2*index+1,count) && dfs(root.right,2*index+2,count);
            
    }
         public int getCount(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+getCount(root.left)+getCount(root.right);
    }
}