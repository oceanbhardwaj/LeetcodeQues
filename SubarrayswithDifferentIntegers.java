class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        
        
        
        
        return cab(A,K)-cab(A,K-1);}
    static int cab(int A[],int K){
        
    
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int start=0;
        int n=A.length;
        int end=0;
        int count=0;
        int d=K-1;
        int sum=0;
        while(end<n)
        {
          h.put(A[end],h.getOrDefault(A[end],0)+1);
           
             
                
            
            while(h.size()>K)
            {
                h.put(A[start],h.get(A[start])-1);
                if(h.get(A[start])==0)
                    h.remove(A[start]);
                start++;
            }
        
         //if(h.size()==K)
        count+=end-start+1;
        
        
        
        
        
        
        
            end++;
            
        }  
            
            
            
            
            
        return count;
        
        
        
        
        
        
        
        
        
        
    }
}