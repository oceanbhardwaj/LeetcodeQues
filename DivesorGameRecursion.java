class Solution {
    public boolean divisorGame(int n) {
     return helper(n);
    }
    static boolean helper(int n)
    {
        if(n<=1)return false;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(helper(n-i)==false)
                    return true;
                
            }
        }
        return false;
    }
}