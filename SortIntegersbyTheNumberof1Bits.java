class Solution {
    public int[] sortByBits(int[] arr) {
        int arr1[]=new int[arr.length];
        
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],Solution.getSetBits(arr[i]));
        }
    PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b)
            {
                int l=h.get(a);
                int m=h.get(b);
                if(l==m)
                    return a-b;
                return l-m;
            }
        });
        
       for(int i:arr)
       {
           pq.add(i);
       }
        int d=0;
        while(!pq.isEmpty())
        {
            arr1[d++]=pq.peek();
            pq.remove();
        }
        return arr1;
        
    }
    static int getSetBits(int n)
    { int count=0;
        while(n!=0)
        {
            count++;
            n=n &(n-1);
        }
        return count;
    }
}