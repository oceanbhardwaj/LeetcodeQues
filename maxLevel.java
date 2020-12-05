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
//........................................................................................................................................................................................................................
class Solution {
    ArrayList<Integer> map=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    int deepestlevel=0;
    int maxlevel=1;
    public int maxLevelSum(TreeNode root) {
        int map[]=new int[10000];
        dfs(root,map,1);
         for(int i=1;i<=deepestlevel;i++)
         {
if(map[i]>max)
{
    max=map[i];
    maxlevel=i;
}
         }
        return maxlevel;
        
        
        
        
        
        
        
        
        
        
        
        
    }
    public void dfs(TreeNode root,int map[],int d)
    {
        if(root==null)
            return;
        if(d>deepestlevel)
            deepestlevel=d;
       
        map[d]+=root.val;
        dfs(root.left,map,d+1);
        dfs(root.right,map,d+1);
    }
}
