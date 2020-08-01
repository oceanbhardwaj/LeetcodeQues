class Solution {
    public int numSteps(String s) {
      int count=0;
        int carry=0;
        for(int i=s.length()-1;i>0;i--)
        {
            count++;
            if((s.charAt(i)-'0'+carry)==1)
            {
                carry=1;
                count++;
            }
            
            
            
            
        }
        
        
        
        
        
        
        
        return count+carry;
        
        
    }
}