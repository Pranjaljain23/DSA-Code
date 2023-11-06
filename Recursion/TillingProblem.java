public class TillingProblem {
    public static int Solution (int n) { // 2 x n floor size and 2 x 1 tile size
        //base
        if(n == 0 || n == 1) {
            return 1;
        }
        //kaam
        int fnm1 = Solution(n - 1);

        int fnm2 = Solution(n - 2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(Solution(4));
    }
}
