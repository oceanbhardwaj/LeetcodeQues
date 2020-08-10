class Solution {
    // ArrayList<String> a=new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        ArrayList<String> a=new ArrayList<>();
        String op="";
        helper(S,op,a);
        return a;
    }
    static void helper(String S,String op,List<String> a)
    {
        if(S.length()==0)
        {
            a.add(op);
            return;
        }
        if(Character.isAlphabetic(S.charAt(0)))
        {
            String op1=op+(S.charAt(0)+"").toLowerCase();
            String op2=op+(S.charAt(0)+"").toUpperCase();
          S=S.substring(1);
            helper(S,op1,a);
            helper(S,op2,a);
           
        }
        else
        {
            String op3=op+S.charAt(0);
            S=S.substring(1);
            helper(S,op3,a);
            
        }
    } 
        
       
        
    }
        
        
            
    
