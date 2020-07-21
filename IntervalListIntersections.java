class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        ArrayList<int[]> a1=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<A.length && j<B.length)
        {
         int a[]=A[i];
            int b[]=B[j];
           if( b[1]<a[0])
               j++;
            else if ( b[0]>a[1])
                i++;
            else 
            {
              int  start=Math.max(a[0],b[0]);
              int  end=Math.min(a[1],b[1]);
                a1.add(new int[]{start,end});
                if(b[1]>=a[1]) i++;
                else if(b[1]<a[1])
                    j++;}}
        return a1.toArray(new int[a1.size()][]);
                
                
                
                
                