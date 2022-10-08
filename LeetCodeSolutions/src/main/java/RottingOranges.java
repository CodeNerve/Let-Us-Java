import java.util.LinkedList;
import java.util.Queue;

//Problem - https://leetcode.com/problems/rotting-oranges/

public class RottingOranges {
    public static void main(String[] args) {
        int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        int freshOranges = 0;
        Queue<int[]> queue = new LinkedList<>();
        //tracks visited cells
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    //counting fresh oranges
                    freshOranges++;
                } else if(grid[i][j] == 2) {
                    //adding to queue so that multi source bfs can be performed
                    queue.add(new int[]{i,j});
                }
            }
        }

        if(freshOranges == 0) {
            return 0;
        }

        int time = -1;
        //cell directions to visit - right, left, down, up
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!queue.isEmpty()) {
            int size = queue.size();
            time++;
            for(int i = 0;i<size;i++) {
                int[] pos = queue.poll();
                if(grid[pos[0]][pos[1]] == 1) {
                    freshOranges--;
                }
                for(int[] dir: dirs) {
                    int newX = dir[0] + pos[0], newY = dir[1] + pos[1];
                    //validation to check if positions are out of grid bounds
                    if(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length || visited[newX][newY] || grid[newX][newY] != 1) {
                        continue;
                    }
                    //marking cell as visited
                    visited[newX][newY] = true;
                    //adding the visited cell to queue
                    queue.add(new int[]{newX, newY});
                }
            }
        }

        return freshOranges == 0 ? time : -1;
    }
}
