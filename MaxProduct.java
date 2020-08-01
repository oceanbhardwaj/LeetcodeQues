class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isValid(words[i],words[j]))
                {
                    max=Math.max(max,words[i].length()*words[j].length());
                    
                }
            }
        }
        return max;
    }
    
     static boolean isValid(String s1,String s2)
     {  ArrayList<Character> a=new ArrayList<>();
         for(int k=0;k<s1.length();k++)
         {
             a.add(s1.charAt(k));
         }
      for(int k=0;k<s2.length();k++)
         {
             if(a.contains(s2.charAt(k)))
             { return false;
             }
         }
      return true;
     }
      
      
      
      
     }
            
            
            
            
            
            
            
            
    
