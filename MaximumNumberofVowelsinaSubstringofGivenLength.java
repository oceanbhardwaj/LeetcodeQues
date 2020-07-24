class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        
    int n=s.length();
        
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
                count++;
        }
        max=Math.max(max,count);
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(i-k)))
                count--;
             if(isVowel(s.charAt(i)))
                count++;
             max=Math.max(max,count);
            
        }
        
        
        return max;
        
        