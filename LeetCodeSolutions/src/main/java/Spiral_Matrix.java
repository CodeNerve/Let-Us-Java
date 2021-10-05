class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        int row_start = 0,col_start=0,row_end=m-1,col_end=n-1;
        int count=1;
        int total= n*m;
        while(count<=total){
            
           for(int col=col_start;col<=col_end && count<=total;col++){
               ans.add(matrix[row_start][col]);
               count++;
           }
            row_start++;
            
            for(int row=row_start;row<=row_end && count<=total;row++){
                ans.add(matrix[row][col_end]);
                count++;
            }
            col_end--;
            
            for(int col=col_end;col>=col_start && count<=total;col--){
                ans.add(matrix[row_end][col]);
                count++;
            }
            row_end--;
            
            for(int row=row_end;row>=row_start && count<=total;row--){
                ans.add(matrix[row][col_start]);
                count++;
            }
            col_start++;
        }
        return ans;
    }
}
