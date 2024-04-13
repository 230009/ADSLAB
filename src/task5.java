import java.util.Scanner;

public class task5 {
    public static int fib(int n){
        if (n <= 1){
            //if n is 0 or 1, return n
            return n;
        }
        else {
            // Recursive case: the nth Fibonacci number is the sum of the (n-1)th and (n-2)th Fibonacci numbers
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fib(n));  // Print the nth Fibonacci number
    }
}