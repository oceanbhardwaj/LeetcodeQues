class GenerateBalancedParenthesis
{
	public static void main(String[] args) {
		
			int n=3;
			int open=n;
			int close=n;
			String op="";
			helper(open,close,op);

		}


static void helper(int open,int close,String op)
{ if(open==0 && close ==0)
	{
		System.out.println(op);
		return;
	}
    if(open!=0)
    {
    	String op1=op+"(";
    	
    	helper(open-1,close,op1); 



    }
    if(close>open)
    {
    	String op2=op+")";
    	helper(open,close-1,op2);
    }




}





	
}