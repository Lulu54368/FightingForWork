class Solution {
    public Boolean dfs(int r, int c, int i, String word, char[][] board, HashSet<List<Integer>> set, int rows, int cols){
     if (i == word.length()){
         return true;
     }
     if(r >= rows || c >= cols|| r < 0 || c<0)  return false;
     if(word.charAt(i) != board[r][c]||
       set.contains(Arrays.asList(r, c)) ){
    
  
         return false;
     }
     set.add(Arrays.asList(r, c));
     Boolean res = (this.dfs(r+1, c, i+1, word, board, set, rows, cols)||
         this.dfs(r, c+1, i+1, word, board, set, rows, cols) ||
         this.dfs(r-1, c, i+1, word, board, set, rows, cols) ||
         this.dfs(r, c-1, i+1, word, board, set, rows, cols));
     set.remove(Arrays.asList(r, c));
     return res;
 }
 public boolean exist(char[][] board, String word) {
     final int ROWS = board.length;
     final int COLS = board[0].length;
     HashSet<List<Integer>> set = new HashSet<>();
     for (int i = 0; i < ROWS; i++){
         for (int j = 0; j < COLS; j++){
           
             if (board[i][j] == word.charAt(0)
                 && dfs(i, j, 0, word,board, set, ROWS, COLS)){
                 return true;
             }
         }
     }
     return false;
 }
 

 

 
}