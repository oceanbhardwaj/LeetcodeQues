class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=1;
        if(s.length()==0)
            return 0;
        HashSet<Character> h=new HashSet<>();
        while(end<s.length())
        {
            while(h.contains(s.charAt(end)))
            {
                //max=Math.max(max,h.size());
                h.remove(s.charAt(start));
                
                start++;
                
            }
           
            h.add(s.charAt(end));
             max=Math.max(max,h.size());
            end++;
                  }
        return max;
        
        
    }
}