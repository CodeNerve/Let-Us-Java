//LeetCode Problem Number #207

// Approach (USING DFS): The problem is basically asking to detect cycle in graph.
// We consider a visited array & mark it as 1 or 2 based on the given cases:
// 1 indicates that the given node is visited and viewed again before completion. (cycle detected)
//This simply means that this node is being visited from a different path since it is still Under process & thus there is presence of a cycle.
// 2 indicates that this given node has completed its processing. Hence returns true (cycle not detected)


// Input Example:
// Input: numCourses = 2, prerequisites = [[1,0]]
// Output: true
// Explanation: There are a total of 2 courses to take. 
// To take course 1 you should have finished course 0. So it is possible.

class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //creating graph
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        
        for(int i=0; i<numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        
        for(int[] pre : prerequisites) {
            adj[pre[0]].add(pre[1]);
        }
        //----------------------//
       
        int[] visited = new int[numCourses];
        
        //check for cycle
        for(int i=0; i<numCourses; i++) {
          //if has cycle, can't finish all the courses. Thus, returns false
            if(!dfs(i, visited, adj))
                return false;
        }
        
        return true;
    }
    //1 indicates UNDER PROCESSING
    //2 indicates PROCESSED
    public boolean dfs(int node, int[] visited, ArrayList<Integer>[] adj) {
        // if we are on a path and come across a node that is Under Processing, there is a cycle
        if(visited[node] == 1) {
            return false;
        }
        
        // Return true if the node has processed i.e. no cycle present
        if(visited[node] == 2) {
            return true;
        }
         
        // Mark the node as UNDER PROCESSING
        visited[node] = 1;
        
        // DFS of all the other nodes current node is connected to
        for(int n : adj[node]) {
            if(!dfs(n, visited, adj))
                return false;
        }
        
        // If no more other nodes for the current node mark as PROCESSED and return true
        visited[node] = 2;
        
        return true;
    }
} 
