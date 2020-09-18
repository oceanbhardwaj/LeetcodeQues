class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()==k)
            return true;
        if(s.length()<k)
            return false;
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(char d:h.keySet())
        {
            if(h.get(d)%2!=0)
                count++;
        }
        
      if(h.size()==k)
          return true;
        if(count>k)
            return false;
        
      return true;  
    }
}