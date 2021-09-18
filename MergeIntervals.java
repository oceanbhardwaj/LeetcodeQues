class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<>()
        {
                        public int compare(int a[],int b[])
                        {
                            if(a[0]==b[0])
                                return a[1]-b[1];
                            return a[0]-b[0];
                        }
                        
        });
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
           int low=intervals[i][0];
            int high=intervals[i][1];
            if(end>=low)
            {
                    end=Math.max(end,high);
            }
            else
            {
                res.add(Arrays.asList(start,end));
                start=low;
                end=high;
            }
        }
        res.add(Arrays.asList(start,end));
        int arr[][]=new int[res.size()][2];
        int index=0;
        for(List<Integer> a:res)
        {
            arr[index][0]=a.get(0);
            arr[index][1]=a.get(1);
            index++;
        }
        return arr;
        
    }
}