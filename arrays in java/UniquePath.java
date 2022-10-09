class Solution {
    
    // Create helper arrays to move in all 4 directions
    int[] moveX = {1, 0, -1, 0};
    int[] moveY = {0, 1, 0, -1};
    int res;
    
    public int uniquePathsIII(int[][] grid) {
        int total = 0;
        int startX = -1;
        int startY = -1;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 0) total++; // track total number of non-obstacles present in grid
                if(grid[i][j] == 1) { // register start point
                    startX = i;
                    startY = j;
                }
            }
        }
        
        // We can use the same array with a placeholder value for visited
        // However, I prefer creating a separate visited array keep code cleaner and readable
        int[][] visited = new int[grid.length][grid[0].length]; 
        backtrack(grid, visited, total, 0, startX, startY);
        return res;
    }
    
    private void backtrack(int[][] a, int[][] visited, int total, int curr, int x, int y) {
        // if the current coordinate is 2 and we have visited the exact count of non-obstacles
        // count as a valid path
        if(a[x][y] == 2 && curr == total) {
            res++;
            return;
        }
        
        for(int i=0; i<4; i++) {
            // generate possible new coordinate for move
            int newX = x + moveX[i];
            int newY = y + moveY[i];
            // check if this move can be made
            if(isValidMove(a, visited, newX, newY)) {
                visited[newX][newY] = 1; // mark the co-ordinate visited
                
                if(a[newX][newY] == 0)
                    backtrack(a, visited, total, curr+1, newX, newY); // increment the current counter only for non-obstacle
                else
                    backtrack(a, visited, total, curr, newX, newY);
                
                visited[newX][newY] = 0; // mark the co-ordinate available for future runs.
            }
        }
        
    }
    
    // creating this auxiliary method to validate our moves, keeps our code clean and manageable
    private boolean isValidMove(int[][] a, int[][] visited, int x, int y) {
        return (x>=0 && x<a.length && y>=0 && y<a[0].length && visited[x][y] == 0 && (a[x][y] == 0 || a[x][y] == 2));
    }
}
