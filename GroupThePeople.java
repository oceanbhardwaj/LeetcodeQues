class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        ArrayList<List<Integer>> a=new ArrayList<>();
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        
        
        for(int i=0;i<groupSizes.length;i++)
        {
            int curr=groupSizes[i];
            List<Integer> res=new ArrayList<>();
            if(h.containsKey(curr))
                res=h.get(curr);
            res.add(i);
            h.put(curr,res);
            
            if(curr==res.size())
            {a.add(res);
             h.remove(curr);}
            
                
        }
        
        return a;
    }
}