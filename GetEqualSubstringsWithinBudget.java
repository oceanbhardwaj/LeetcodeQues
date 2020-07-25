class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
       
        int start=0;
        int end=0;
        int ans=0;
        int max=0;
        while(end<n)
        {
           ans=ans+Math.abs((int)(s.charAt(end))-(int)(t.charAt(end))) ;
            while(ans>maxCost)
            {
                ans=ans-Math.abs((int)(s.charAt(start))-(int)(t.charAt(start)));
                start++;
            }
            max=Math.max(max,end-start+1);
            end++;
        }
        return max;
               
            