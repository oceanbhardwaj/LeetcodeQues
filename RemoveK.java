class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> s=new Stack<Character>();
        s.push(num.charAt(0));
       // if(num.length()==k)
           // return " ";
        for(int i=1;i<num.length();i++)
        {
             while(!s.isEmpty() && s.peek()>num.charAt(i) && k>0)
            {
                  s.pop();
                k--;}
            if(!s.isEmpty() || num.charAt(i)!='0')
                s.push(num.charAt(i));
        }
while(!s.isEmpty() && k-->0)
{
    s.pop();
    //k--;
}
        if(s.isEmpty())
            return "0";
        
        
        
        
        
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.peek());
            s.pop();
        }
        sb.reverse();
        String d=sb.toString();
        return d;
        
        
        
        
        
        
        
        
        
        
    }
}