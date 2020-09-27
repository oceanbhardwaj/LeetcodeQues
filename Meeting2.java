public class Solution {
    public int solve(int[][] A) {
        Comparator co=new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
            
        };
        Arrays.sort(A,co);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        
        for(int i=0;i<A.length;i++)
        {
            if(!pq.isEmpty() && A[i][0]>=pq.peek())
            pq.poll();
            pq.add(A[i][1]);
            
        }
        return pq.size();
    }
}
