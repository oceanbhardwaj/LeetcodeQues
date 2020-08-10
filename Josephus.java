import java.util.*;
class Josephus
{
	public static void main(String[] args) {
		int n=5;
        int k=2;
         k=k-1;
        int ans=-1;
        int index=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
        	a.add(i);
        }
    int d=Helper(n,k,index,ans,a);
      System.out.println(d);

	}
	static int Helper(int n,int k,int index,int ans,ArrayList<Integer> a)
	{
    if(a.size()==1)
    { ans=a.get(0);
    	return ans;
    	
    }

    index=(index+k)%a.size();
    a.remove(index);
  return Helper(n,k,index,ans,a);
    



	}
}