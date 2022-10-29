by-ajay

import java.util.ArrayDeque;
import java.util.Queue;
 
class Node
{
    int x, y, dist;
 
    Node(int x, int y, int dist)
    {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
 
class Main
{
    private static final int[] row = { -1, 0, 0, 1 };
    private static final int[] col = { 0, -1, 1, 0 };
 
  
    private static boolean isValid(int[][] mat, boolean[][] visited, int row, int col)
    {
        return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat[0].length)
                && mat[row][col] == 1 && !visited[row][col];
    }

    private static int findShortestPathLength(int[][] mat, int i, int j, int x, int y)
    {
     
        if (mat == null || mat.length == 0 || mat[i][j] == 0 || mat[x][y] == 0) {
            return -1;
        }
 
   
        int M = mat.length;
        int N = mat[0].length;
        boolean[][] visited = new boolean[M][N];
 
        Queue<Node> q = new ArrayDeque<>();
 
        visited[i][j] = true;
        q.add(new Node(i, j, 0));
 
        int min_dist = Integer.MAX_VALUE;
 
        while (!q.isEmpty())
        {
            Node node = q.poll();
 
          
            i = node.x;
            j = node.y;
            int dist = node.dist;
            if (i == x && j == y)
            {
                min_dist = dist;
                break;
            }
 
            for (int k = 0; k < 4; k++)
            {

                if (isValid(mat, visited, i + row[k], j + col[k]))
                {
          
                    visited[i + row[k]][j + col[k]] = true;
                    q.add(new Node(i + row[k], j + col[k], dist + 1));
                }
            }
        }
 
        if (min_dist != Integer.MAX_VALUE) {
            return min_dist;
        }
        return -1;
    }
 
    public static void main(String[] args)
    {
        int[][] mat =
        {
            { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
            { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
            { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
        };
 
        int min_dist = findShortestPathLength(mat, 0, 0, 7, 5);
 
        if (min_dist != -1) {
            System.out.println("The shortest path from source to destination " +
                    "has length " + min_dist);
        } else {
            System.out.println("Destination cannot be reached from source");
        }
    }
}
