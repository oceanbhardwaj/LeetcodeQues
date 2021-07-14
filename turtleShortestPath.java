/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    static class Pair{
        int destination;
        int distance;
        Pair(int destination,int distance)
        {
            this.destination=destination;
            this.distance=distance;
        }
        
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	
		for(int testCase=0;testCase<t;testCase++)
		{
		    HashMap<String,Integer> h=new HashMap<>();
		    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
		    int noOfCities=sc.nextInt();
		    for(int j=0;j<=noOfCities;j++)
		    {
		        adj.add(new ArrayList<Pair>());
		    }
		    for(int cities=1;cities<=noOfCities;cities++){
		     String city=sc.next();
		    h.put(city,cities);
		    int neighbour=sc.nextInt();
		    for(int neigh=0;neigh<neighbour;neigh++)
		    {
		        int to=sc.nextInt();
		        int dist=sc.nextInt();
		        adj.get(cities).add(new Pair(to,dist));
		        
		    }
		   }
		   int path=sc.nextInt();
		   for(int p=0;p<path;p++)
		   {
		       String fromCity=sc.next();
		       String toCity=sc.next();
		       int a=h.get(fromCity);
		       int b=h.get(toCity);
		       int dist[]=new int[noOfCities+1];
		       boolean visited[]=new boolean[noOfCities+1];
		       Arrays.fill(dist,Integer.MAX_VALUE);
		       
		       dist[a]=0;
		       dijkstra(adj,visited,dist,a);
		       
		       
		       
		       System.out.println(dist[b]);
		       
		       
		   }
		}
	}
	public static void dijkstra(ArrayList<ArrayList<Pair>> adj,boolean visited[],int dist[],int source)
	{
	    Comparator co=new Comparator<Pair>(){
	        public int compare(Pair p1,Pair p2)
	        {
	            return p1.distance-p2.distance;
	        }
	    };
	    PriorityQueue<Pair> pq=new PriorityQueue<>(co);
	    pq.add(new Pair(source,0));
	    while(!pq.isEmpty())
	    {
	        Pair curr=pq.poll();
	        
	        int destination_x=curr.destination;
	        int distance_x=curr.distance;
	        if(visited[destination_x])
	        continue;
	        visited[destination_x]=true;
	        //finding adj
	        for(int i=0;i<adj.get(destination_x).size();i++)
	        {
	            Pair adj_x=adj.get(destination_x).get(i);
	            int desti=adj_x.destination;
	            int disti=adj_x.distance;
	            if(!visited[desti])
	            {
	                dist[desti]=Math.min(dist[desti],distance_x+disti);
	                pq.add(new Pair(desti,dist[desti]));
	            }
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}