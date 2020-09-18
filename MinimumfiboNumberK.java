class Solution {
    public int findMinFibonacciNumbers(int k) {
        TreeSet<Integer> t=new TreeSet<>();
        int c=0;
        int a=1;
        int b=1;
        t.add(1);
        t.add(1);
        while(c<k)
        {
            c=a+b;
            a=b;
            b=c;
           t.add(c); 
        }
        int sum=k;
        int count=0;
        while(sum!=0)
        {
        int d=t.floor(sum);
            count++;
            sum=sum-d;
        }
        
        return count;
    }
}