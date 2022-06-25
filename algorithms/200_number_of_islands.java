class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    count++;
                }
                bfs(grid, i, j, rows, cols);
            }
        }
        return count;
    }
    public void bfs(char[][] grid, int i, int j, int rows, int cols){
        if(i < 0 || i >= rows || j < 0|| j>= cols)
            return;
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        
        bfs(grid, i+1, j, rows, cols);
        bfs(grid, i-1, j, rows, cols);
        bfs(grid, i, j+1, rows, cols);
        bfs(grid, i, j-1, rows, cols);
        }
        return;
    }
}