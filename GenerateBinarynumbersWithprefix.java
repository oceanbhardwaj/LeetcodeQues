class GenerateBinarynumbersWithprefix
{
	public static void main(String[] args) {
		
			int n=5;
			String op="";
			int ones=0;
			int zeroes=0;
			helper(n,ones,zeroes,op);
		
		}
		static void helper(int n,int ones,int zeroes,String op)
		{
          if(n==0)
          {
          	System.out.println(op);
          	return;
          }
         String op1=op+"1";
         helper(n-1,ones+1,zeroes,op1);
         if(ones>zeroes)
         {
         	String op2=op+"0";
         	helper(n-1,ones,zeroes+1,op2);
         }








		}
	
}