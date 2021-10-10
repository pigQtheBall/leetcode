package easy.q70;

class Solution {
    // fibonacci number
    // f(n) = f(n-2) + f(n-1)
    public int climbStairs2(int n) {
        if (n==1 || n==2) return n;
        return(climbStairs2(n-1)+climbStairs2(n-2));
    }


    // use an array to store all the previously computed numbers
    public int climbStairs(int n) {
        if (n==1 || n==2) return n;
        int arr[] = new int[n];
        // f(1) = 1
        arr[0] = 1;
        // f(2) = 2
        arr[1] = 2;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }
}
