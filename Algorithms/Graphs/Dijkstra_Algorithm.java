// Program to find the weight of the minimum spanning tree using Dijkstra's Algorithm

import java.util.*;
//implemented Comparator interface for sorting according to the weight
class Node2 implements Comparator<Node2>{
	private int edge;
	private int weight;
	Node2(){}
	Node2(int edge, int weight){
		this.edge = edge;
		this.weight = weight;
	}
	public int getEdge() {
		return this.edge;
	}
	public int getWeight() {
		return this.weight;
	}
	@Override
	public int compare(Node2 o1, Node2 o2) {
		if(o1.weight > o2.weight) {
			return 1;
		}
		else if(o1.weight < o2.weight) {
			return -1;
		}
		return 0;
	}
}
public class Dijkstra_Algorithm {
	int V;
	LinkedList<Node2>[] ll;
	Dijkstra_Algorithm(int v){
		this.V = v;
		ll = new LinkedList[V];
		for(int i =0 ; i<V; i++) {
			ll[i] = new LinkedList<Node2>();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dijkstra_Algorithm ob = new Dijkstra_Algorithm(6);
		ob.addEdge(0, 1, 5);
		ob.addEdge(1, 2, 2);
		ob.addEdge(3, 4, 5);
		ob.addEdge(3, 2, 6);
		ob.addEdge(2, 4, 3);
		ob.addEdge(5, 3, 1);
		ob.addEdge(1, 5, 3);
		int i=1;
		System.out.print("Shortest Path of "+i+" is : ");
		ob.dijkstraAlgo(i);
	}
	void dijkstraAlgo(int source) {
		int arr[] = new int[V];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[source]=0;
		//Undirected Graph
		PriorityQueue<Node2> pq = new PriorityQueue<Node2>(V,new Node2());
		pq.add(new Node2(source,0));
		//All weights should be positive or else it does not work properly
		while(! pq.isEmpty()) {
			Node2 curr = pq.poll();
			for(Node2 it : ll[curr.getEdge()]) {
				if(arr[it.getEdge()] > it.getWeight()+arr[curr.getEdge()]) {
					arr[it.getEdge()] = it.getWeight()+arr[curr.getEdge()];
					pq.add(new Node2(it.getEdge(),arr[it.getEdge()]));
				}
			}	
		}
		for(int i=0;i<V;i++) {
			if(arr[i] == Integer.MAX_VALUE) {
				System.out.print("INF ");
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	void addEdge(int i, int j, int w) {
		ll[i].add(new Node2(j,w));
		ll[j].add(new Node2(i,w));
	}
}
