class Solution {
    public List<Integer> partitionLabels(String S) {
        int n=S.length();
        int start=0;
        int end=0;
        ArrayList<Integer> res=new ArrayList<>();
        int last[]=new int[26];
        for(int i=0;i<n;i++)
        { last[S.charAt(i)-'a']=i;
      }
        
        for(int i=0;i<n;i++)
        {
            end=Math.max(last[S.charAt(i)-'a'],end);
            if(i==end)
            {res.add(i-start+1);
            start=i+1;}
        }
        return res;
            
            
            