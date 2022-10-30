//by - ajay

import java.util.HashMap;
import java.util.Map;
 

class DisjointSet
{
    private Map<Integer, Integer> parent = new HashMap<>();
 
    public void makeSet(int[] universe)
    {
        for (int i: universe) {
            parent.put(i, i);
        }
    }
 
    public int Find(int k)
    {
        if (parent.get(k) == k) {
            return k;
        }
 
        return Find(parent.get(k));
    }
 
    public void Union(int a, int b)
    {
        int x = Find(a);
        int y = Find(b);
 
        parent.put(x, y);
    }
}
 
class Main
{
    public static void printSets(int[] universe, DisjointSet ds)
    {
        for (int i: universe) {
            System.out.print(ds.Find(i) + " ");
        }
 
        System.out.println();
    }
 
    public static void main(String[] args)
    {
        int[] universe = { 1, 2, 3, 4, 5 };
 
        DisjointSet ds = new DisjointSet();
 
        ds.makeSet(universe);
        printSets(universe, ds);
 
        ds.Union(4, 3);
        printSets(universe, ds);
 
        ds.Union(2, 1);  
        printSets(universe, ds);
 
        ds.Union(1, 3);    
        printSets(universe, ds);
    }
}
