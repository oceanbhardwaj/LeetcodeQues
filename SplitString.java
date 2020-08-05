class Solution {
    public int numSplits(String s) {
        HashMap<Character,Integer>h1=new HashMap<>();
         HashMap<Character,Integer>h2=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            h2.put(s.charAt(i),h2.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            h1.put(s.charAt(i),h1.getOrDefault(s.charAt(i),0)+1);
            h2.put(s.charAt(i),h2.get(s.charAt(i))-1);
            if(h2.get(s.charAt(i))==0)
                h2.remove(s.charAt(i));
            if( h1.size()==h2.size() && h1.size()!=0)
                count++;
        }
        return count;
        
    }
}