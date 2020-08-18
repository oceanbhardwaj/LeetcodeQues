class GenerateAllBinaryWithoutConsecutiveOnes
{
	public static void main(String[] args) {
		int k=4;
		String op="";
		helper(op,k);
	}
	static void helper(String op,int k)
	{
		if(k==0)
		{
			System.out.println(op);
			return;
		}
		String op1=op+"0";
		helper(op1,k-1);
		if( (op.length()!=0 && op.charAt(op.length()-1)=='0') || op.length()==0)
		{
			String op2=op+"1";
			helper(op2,k-1);
		}
	}
}