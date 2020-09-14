class Solution {
    public int minDeletionSize(String[] A) {
        int n=A[0].length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<A.length-1;j++)
            {
               if(A[j].charAt(i)<=A[j+1].charAt(i))
                   continue;
                else
                { count++;
                 break;}
                
            }
        }
         return count;   
        
    }
}