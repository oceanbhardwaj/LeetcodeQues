class Solution {
    public char findTheDifference(String s, String t) {
       /* HashSet<Character> h=new HashSet<Character>();  //first
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
        return c;*/
        
    /*  int ch=(int)(t.charAt(0));      //second
        for(int i=1;i<t.length();i++)
        {
            ch=ch^(int)(t.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            ch=ch^(int)s.charAt(i);
        }        
        return (char)ch;*/
        
        
        int d=0;
        int e=0;
        for(int i=0;i<t.length();i++)
        {
            d=d+(int)(t.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
           e=e+ (int)s.charAt(i);
        }        
        int f=d-e;
        return (char)f;
        
        
        
        
        
        
    }
}