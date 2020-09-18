class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(int j:h.keySet())
        {
            p.add(h.get(j));
        }
        int n=arr.length;
        int f=n;
        int count=0;
        
        while(n>f/2)
        { 
            int d=p.poll();
            n=n-d;
            count++;
            
        }
        return count;
    }
}