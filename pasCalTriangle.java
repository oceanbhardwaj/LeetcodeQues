class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(numRows==0)
            return res;
        res.add(new ArrayList<>());
        res.get(0).add(1);
        
        for(int i=1;i<numRows;i++)
        {
            ArrayList<Integer> a=new ArrayList<Integer>();
            a.add(1);
            for(int j=0;j<i-1;j++)
            {
                a.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
            }
            a.add(1);
            res.add(a);
        }
        return res;
    }
}