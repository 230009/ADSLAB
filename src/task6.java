import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // Read the base 'a'
        int n = scan.nextInt(); // Read the exponent 'n'
        System.out.println(power(a, n));

    }

    public static int power(int a, int n){
        if (n == 0){
            //any number to the power of 0 is 1
            return 1;
        }
        else {
            // Recursive case: multiply 'a' by the result of a raised to the power of (n-1)
            return a * power(a, n -1 );
        }
    }
}
