public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	for(int i1=0;i1<t;i1++)
	{
	    String s=sc.nextLine();
	    String []str=s.split(" ");
	    long n=Long.parseLong(str[0]);
	    long k=Long.parseLong(str[1]);
	    
	    if(k>n-k)
	    k=n-k;
	    
	    
	    long res=1;
	    for(int i=0;i<k;i++)
	    {
	        res=(res*(n-i))%(long)(1e9+7);
	        res=res/(i+1);
	    }
	    System.out.println(res%(long)(1e9+7));
	}
	}
}