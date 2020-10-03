class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        if(num.length()<=1)
            return "0";
        for(int i=0;i<num.length();i++)
        {
         
            while(!s.isEmpty() && Integer.parseInt(num.charAt(i)+"")<Integer.parseInt(s.peek()+"") && k>0 )
            { s.pop();
             k--;}
            if(s.isEmpty() && num.charAt(i)=='0')
         {
             continue;
         }
            else
            s.push(num.charAt(i));
        
        
        
        
        }
        while(!s.isEmpty() &&  k>0)
        {s.pop();
         k--;}
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.peek());
            s.pop();
        }
        sb.reverse();
        String s1=sb.toString();
        return (s1.equals(""))?"0":s1;
    }
}