public class task9 {
    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        System.out.println(binom(n, k));
    }
    public static int binom(int n, int k){
        if (k == 0 || k == n){
            return 1;
            //C(n, 0) and C(n, n) are 1 because there is only one way to select 0 items or all items
        }
        else {
            return binom(n-1, k - 1) + binom(n - 1, k);
            // Recursive case: Apply the recurrence relation C(n, k) = C(n-1, k-1) + C(n-1, k)
        }
    }
}
