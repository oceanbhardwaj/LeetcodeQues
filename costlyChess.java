/*package whatever //do not write package name here */

import java.util.*;

class GFG {
  static  class Pair{
        int x;
        int y;
        int d;
        Pair(int x,int y,int d)
        {
            this.x=x;
            this.y=y;
            this.d=d;
            
        }
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int arr[][]=new int[8][8];
	int dist[][]=new int[8][8];
	for(int i=0;i<8;i++)
	{
	    Arrays.fill(dist[i],Integer.MAX_VALUE);
	}
	boolean visited[][]=new boolean[8][8];
	int arrX[]={-2,-2,-1,1,2,2,1,-1};
	int arrY[]={-1,1,2,2,1,-1,-2,-2};
	  
	PriorityQueue<Pair> q=new PriorityQueue<Pair>((o1,o2)->o1.d-o2.d);
	q.add(new Pair(a,b,0));
//	visited[a][b]=true;
	dist[a][b]=0;
	int ans=Integer.MAX_VALUE;
	while(!q.isEmpty())
	{
	    Pair p=q.poll();
	    int X=p.x;
	    int Y=p.y;
	    int D=p.d;
	    if(X==c && Y==d)
	    {
	        ans=dist[X][Y];
	        break;
	    }
	    if(visited[X][Y])
	        continue;
	    visited[X][Y]=true;
	    for(int i=0;i<8;i++)
	    {
	            int xx=X+arrX[i];
	            int yy=Y+arrY[i];
	            if(xx>=0 && yy>=0 && xx<=7 && yy<=7 && !visited[xx][yy])
	            {
	                q.add(new Pair(xx,yy,X*xx+Y*yy+D));
	                dist[xx][yy]=Math.min(dist[xx][yy],D+X*xx+Y*yy);
	                
	            }
	       
	    }
	}
	if(dist[c][d]==Integer.MAX_VALUE)
	ans=-1;
	System.out.println(ans);
	}
	}
}