import java.util.*;
public class Classroom{
    static class Edge{
        int src;
        int dest;
        int wt;
    public Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }    
    }
    static void create Graph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(s:0,d:1,w:1));
        graph[0].add(new Edge(s:0,d:2,w:1));
        
        graph[1].add(new Edge(s:1,d:0,w:1));
        graph[1].add(new Edge(s:1,d:3,w:1));

        graph[2].add(new Edge(s:2,d:0,w:1));
        graph[2].add(new Edge(s:2,d:4,w:1));

        graph[3].add(new Edge(s:3,d:1,w:1));
        graph[3].add(new Edge(s:3,d:4,w:1));
        graph[3].add(new Edge(s:3,d:5,w:1));

        graph[4].add(new Edge(s:4,d:2,w:1));
        graph[4].add(new Edge(s:4,d:3,w:1));
        graph[4].add(new Edge(s:4,d:5,w:1));

        graph[5].add(new Edge(s:5,d:3,w:1));
        graph[5].add(new Edge(s:5,d:4,w:1));
        graph[5].add(new Edge(s:5,d:6,w:1));

        graph[5].add(new Edge(s:5,d:5,w:1));
        
        
    }
    public static void dfs(ArrayList<Edge>graph,int curr,boolean vis[]){
        //visit
        System.out.print(curr+"");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[curr]){
                dfs(graph,e.dist,vis);
            }
        }
    } 
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        dfs(graph,0,new boolean[V]);
    }
    }

