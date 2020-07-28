/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
 int len=inorder.length;
        return Helper(preorder,inorder,0,len-1,0,len-1);
        
    }
    
  static  TreeNode Helper(int[] preorder,int[]inorder,int instart,int inend,int prestart,int preend)
    { 
      if(instart>inend)
          return null;
      
      
      
      int rootval=preorder[prestart];
        TreeNode root=new TreeNode(rootval);
        int rootindex=instart;
        for(;rootindex<=inend;rootindex++)
        {
            if(inorder[rootindex]==rootval)
                break;
        }
        int leftheight=rootindex-instart;
        int rightheight=inend-rootindex;
           
        
        root.left=Solution.Helper( preorder, inorder,instart,rootindex-1,prestart+1,prestart+leftheight-1);
         root.right=Solution.Helper( preorder, inorder,rootindex+1,inend,prestart+rootindex-instart+1,preend);
        
        return root;
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
        
        
    
