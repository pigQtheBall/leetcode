package medium.q59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int ct = 1;
        int loop = n / 2;
        int i = 0;
        int j = 0;
        int offset = 1;

        while(loop > 0){
            i = offset - 1;
            j = offset - 1;
            // from left to right horizontally
            for(j=offset - 1; j<n-offset; j++){
                res[i][j] = ct;
                ct++;
            }

            // from top to bottom vertically
            for(i=offset - 1; i<n-offset; i++){
                res[i][j] = ct;
                ct++;
            }

            // from right to left horizontally
            for(j = n - offset; j>=offset; j--){
                res[i][j] = ct;
                ct++;
            }

            // from bottom to top vertically
            for(i = n - offset; i>=offset; i--){
                res[i][j] = ct;
                ct++;
            }
            offset++;
            loop--;
        }

        if(n%2 != 0){
            res[n/2][n/2] = ct;
        }
        return res;
    }
}
