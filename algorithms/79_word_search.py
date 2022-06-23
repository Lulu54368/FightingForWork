class Solution(object):
    def exist(self, board, word):
        ROWS, COLS = len(board), len(board[0])
        path = set()
        def dfs(r, c, i):
            print(r, c)
            if i == len(word):
                return True
            if r>= ROWS or c >= COLS or word[i] != board[r][c] or (r, c) in path or r < 0 or c < 0:
                    return False
            path.add((r, c))
            res = dfs(r+1, c, i+1) or dfs(r, c+1, i+1)or dfs(r-1, c, i+1) or dfs(r, c-1, i+1)
            path.remove((r, c))
            return res
        for i in range(0, ROWS):
            for j in range(0, COLS):
                if dfs(i, j, 0):
                    return True
        return False
        