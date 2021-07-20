class Solution {
    public void reverseString(char[] s) {
        dfs(0,s.length-1,s);
    }
    public void dfs(int left,int right,char s[])
    {
        if(right<=left || left>s.length/2 || right<0)
            return;
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        dfs(left+1,right-1,s);
    }
}