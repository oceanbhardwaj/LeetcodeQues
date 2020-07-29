class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<Character> h=new HashSet<Character>();
        char c='a';
        for(int i=0;i<s.length();i++)
        {
             if(!h.contains(s.charAt(i)))
            h.add(s.charAt(i));
            else
                h.remove(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            if(!h.contains(t.charAt(i)))
            h.add(t.charAt(i));
            else
                h.remove(t.charAt(i));
        }
        for(char ch:h)
            c=ch;
        return c;
    }
}