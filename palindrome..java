class GfG
{
	public static int palinArray(int[] arr, int n)
           {
                 for(int i=0;i<n;i++)
                 {
                     if(!palindrome(arr[i]))
                     return 0;
                 }
                 return 1;
           }
           public static boolean palindrome(int n)
           {
               int act=n;
               int sum=0;
               int d=0;
               while(n>0)
               {
                   d=n%10;
                   sum=sum*10+d;
                   n=n/10;
               }
               return sum==act;
           }
}