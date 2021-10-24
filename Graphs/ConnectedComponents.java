import java.util.*;
public class ConnectedComponents {
    int V;
    ArrayList<ArrayList<Integer> > adjListArray;

    ConnectedComponents(int V)
    {
        this.V = V;

        adjListArray = new ArrayList<>();

 
        for (int i = 0; i < V; i++) {
            adjListArray.add(i, new ArrayList<>());
        }
    }
 

    void addEdge(int src, int dest)
    {

        adjListArray.get(src).add(dest);

        adjListArray.get(dest).add(src);
    }
 
    void DFSUtil(int v, boolean[] visited)
    {

        visited[v] = true;
        System.out.print(v + " ");

        for (int x : adjListArray.get(v)) {
            if (!visited[x])
                DFSUtil(x, visited);
        }
    }
    void connectedComponents()
    {

        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; ++v) {
            if (!visited[v]) {

                DFSUtil(v, visited);
                System.out.println();
            }
        }
    }
 

    public static void main(String[] args)
    {

        ConnectedComponents g = new ConnectedComponents(
            5); 
 
        g.addEdge(1, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        System.out.println("Following are connected components");
        g.connectedComponents();
    }
}
