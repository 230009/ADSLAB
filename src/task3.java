import java.util.Scanner;

public class task3 {
    private static boolean helper(int n, int divisor){ // Helper recursive method to check if a number 'n' is prime by testing divisibility
        if (divisor == 1){
            return true; //if the divisor is 1, the number is not divisible by any number greater than 1, hence it's prime
        }
        else if (n % divisor == 0){
            //it's not a prime number
            return false;
        }
        else {
            //decrement the divisor and check again
            return helper(n, divisor - 1);
        }
    }
    public static boolean isprime(int n){
        if (n <= 1){
            //// Numbers less than or equal to 1 are not prime
            return false;
        }
        else {
            //// Start the helper function
            return helper(n, n/2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isprime(n));
    }
}