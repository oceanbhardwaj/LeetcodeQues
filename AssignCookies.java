class Solution {
   
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        if(g.length==0 || s.length==0)
            return 0;
        
        int count=0;
        //se=new int[s.length];
        for(int i=0;i<g.length;i++)
        {
            if(contains(g[i],s))
                count++;
        }
        return count;
    }
    static boolean contains(int n,int s[])
    {
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>=n )
            {s[i]=0;
                return true;}
        }
        return false;
    }
}