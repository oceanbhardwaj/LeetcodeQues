import java.util.*;
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String res="";
        int max=0;
        Collections.sort(d);
        for(String word:d)
        {
            if(max<word.length() && issubsequence(word,s))
            {
                max=word.length();
                res=word;
            }
        }
        return res;
        
    }
    
    static boolean issubsequence(String str1,String str2)
    { int j=0;
        int n=str1.length();
        for(int i=0;i<str2.length();i++)
        {
            if(str1.charAt(j)==str2.charAt(i))
                j++;
            if(j==n)
                return true;
            
            
        }
        return false;
    }
    
}