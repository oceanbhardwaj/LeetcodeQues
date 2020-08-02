class Solution {
    public int minFlips(String target) {
        int state=0;
        int ans=0;
        for(int i=0;i<target.length();i++)
        {
            if(state!=(target.charAt(i)-'0'))
            {
                ans=ans+1;
                state=target.charAt(i)-'0';
            }
        }
        return ans;
        
    }
}