class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='[' || x.charAt(i)=='{')
            s.push(x.charAt(i));
            else if(!s.isEmpty() && x.charAt(i)=='}' && s.peek()=='{')
            s.pop();
            else if(!s.isEmpty() && x.charAt(i)==']' && s.peek()=='[')
            s.pop();
            else if(!s.isEmpty() && x.charAt(i)==')' && s.peek()=='(')
            s.pop();
            else
            return false;
        }
        return s.isEmpty();
    }
}
