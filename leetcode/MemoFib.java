public class MemoFib {
    static int[] memo = {-1};
    // System.out.print(Arrays.toString(memo));
  // using memoization
    public static int fib(int n){
         
        if (n<=1){
            return n;
        }
        if (memo[n] != -1){
            return memo[n];
        }
        memo[n] = fib(n-1)+fib(n-2);
        // System.out.print(Arrays.toString(memo));

            return memo[n];
        }
       public static void main(String[] args) {
        System.out.println(fib(3));
       }
}