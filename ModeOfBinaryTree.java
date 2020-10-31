...................................................................................Mode of Binary tree........Iterative.........................................................................................
class Solution {
    public int[] findMode(TreeNode root) {
        if(root==null)
            return new int[0];
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        q.add(root);
        int max=0;
        ArrayList<Integer> a=new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            h.put(curr.val,h.getOrDefault(curr.val,0)+1);
            max=Math.max(max,h.get(curr.val));
            if(curr.left!=null)
                 q.add(curr.left);
            if(curr.right!=null)
                 q.add(curr.right);
            
            
        }
        for(int i:h.keySet())
        {
            if(h.get(i)==max)
                a.add(i);
        }
        int arr[]=new int[a.size()];
        int d=0;
        for(int i:a)
        {
            arr[d++]=i;
        }
        return arr;
    }
}


......................................................................................................Recursive.............................................................................................................................................
class Solution {
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        traverse(root,a);
        int arr[]=new int[a.size()];
        int d=0;
        for(int i:a)
        {
            arr[d++]=i;
        }
        return arr;
    }
    private void traverse(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
            return;
        traverse(root.left,a);
        if(prev!=null)
        {
            if(prev==root.val)
                count++;
            else 
                count=1;
        }
        if(count>max)
        {
            max=count;
            a.clear();
            a.add(root.val);
            
        }else if(count==max)
            a.add(root.val);
        
        prev=root.val;
        traverse(root.right,a);
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
}
















