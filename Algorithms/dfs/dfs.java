import java.util.*;
//DFS : Depth First Search, means we have to go depth atfirst.
public class DFS {

  //total number of vertices is V which is 6.
	static int V = 6;
	public static void main(String[] args) {

    // Creating HashMap to store the edges of each vertices. We can use ArrayList of ArrayList or Array of LinkedList as well to store edges.
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();

    //Stroring ArrayList at each vertices
		for(int i=0;i<V;i++) {
			map.put(i, new ArrayList<Integer>());
		}

		DFS ob = new DFS();
    //adding edges in the map
		ob.addEdge(map,0,1);
		ob.addEdge(map,0,2);
		ob.addEdge(map,1,2);
		ob.addEdge(map,2,5);
		ob.addEdge(map,3,2);
		ob.addEdge(map,4,1);
		ob.addEdge(map,4,3);

    //traversal method
		ob.DFSTraversal(map);
	}

	void travers(HashMap<Integer,ArrayList<Integer>> map, int data, boolean[] visited) {
    //checking if the vertex if visited then no need to visit or else it will give us TLE.
		if(visited[data] == true) {
			return;
		}
    //marked true as we visited this vertex.
		visited[data] = true;

    //getting the ArrayList through the map where we store the edges of this vertex.
		ArrayList<Integer> al = map.get(data);

    //iterating through those edges.
		for(int i=0 ; i<al.size() ;i++) {
			travers(map,al.get(i),visited);
		}
    //At the end printing the vertex.
		System.out.print(data+" ");
	}
	void DFSTraversal(HashMap<Integer,ArrayList<Integer>> map) {

    //created visited array to check taht if we have visited the vertices or not.
		boolean[] visited = new boolean[V];

    //So, we are iterating from 0 to V-1 vertices & checking that the vertices is visited or not.
		for(int i=0; i< visited.length ;i++) {

      //if the vertices is not visited then travers it.
			if(visited[i] == false) {
				travers(map,i,visited);
			}
		}
	}

  // here 'i' is source & 'j' is destination. We are adding the destination in the ArrayList.
	void addEdge(HashMap<Integer,ArrayList<Integer>> map, int i, int j) {
		map.get(i).add(j);
	}
}
