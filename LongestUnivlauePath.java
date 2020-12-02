class Solution {
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        call(root);
        return max;
    }
        public int call(TreeNode root){
        if(root==null)
            return 0;
        int left=call(root.left);
        int right=call(root.right);
        int a=0;
        int b=0;
        if(root.left!=null && root.val==root.left.val)
            a=left+1;
        if(root.right!=null && root.val==root.right.val)
            b=right+1;
        max=Math.max(a+b,max);
        return Math.max(a,b);
        
    }
}