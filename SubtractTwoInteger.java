import java.util.*;
class SubtractTwoInteger
{  
	public static void main(String[] args) 
	{  int a=2;
	   int b=-6;
	   b=-1*b;
	   int carry=0;
	   while(b!=0)
	   {
	   	carry=a&b;
	   	a=a^b;
	   	b=carry<<1;
	   }
	   System.out.println(a);
	}
}






		