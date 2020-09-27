class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
               if(a[1]==b[1])
                   return a[0]-b[0];
                return a[1]-b[1];
            }
            
        };
        Arrays.sort(points,co);
        int count=1;
        int max=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(max<points[i][0])
            { count++;
             max=points[i][1];}
        }
        return count;
    }
}