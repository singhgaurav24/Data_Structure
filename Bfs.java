import java.util.*;
public class Bfs 
{
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u ,int v)
    {
    	adj.get(u).add(v);
    	adj.get(v).add(u);	
    }
	
	static void BFS(ArrayList<ArrayList<Integer>> adj,int V)
	{
		boolean visited[] = new boolean[V+1]; //create an boolean array
		
		for(int i=1; i<=V; i++)  //mark all the vertices not visited
		{
			visited[i] = false;
		}
		LinkedList<Integer> queue = new LinkedList<Integer>(); //Create a queue for BFS
		{
			int s = 1; // Source vertex is 1
			
			visited[s]=true; //mark the current node as visited an enqueue it
			queue.add(s);
			
			while(queue.size()!=0)
			{
				s = queue.poll();   //Dequeue a vertex from queue and print it 
				System.out.print(s + " "); 
				
				for(int i = 0;i<adj.get(s).size();i++)
				{
					int newNode = adj.get(s).get(i);
					if(visited[newNode] == false)
					{
						visited[newNode] = true;
						
						queue.add(newNode);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int V = 6;
          ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V+1);
          
          for(int i = 0; i<V+1 ;i++)
          {
        	  adj.add(new ArrayList<Integer>());
          }
          addEdge(adj, 1, 2);
          addEdge(adj, 1, 3);
          addEdge(adj, 2, 4);
          addEdge(adj, 2, 5);
          addEdge(adj, 3, 5);
          addEdge(adj, 4, 5);
          addEdge(adj, 4, 6);
          addEdge(adj, 5, 6);
          
          BFS(adj,V);
          
	}

}
