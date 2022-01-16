package medium.q200;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    visit(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void visit(char[][] grid, int r, int c){
        if(r<0 || c<0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;
        grid[r][c] = '0';
        visit(grid, r-1, c);
        visit(grid, r+1, c);
        visit(grid, r, c-1);
        visit(grid, r, c+1);
    }
}
