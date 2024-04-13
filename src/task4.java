import java.util.Scanner;

public class task4 {
    public static int fctrl(int n){
        if (n < 0) {
            //if n is negative since factorial is not defined for negative numbers
            throw new IllegalArgumentException();
        }
        else if (n == 0 || n == 1){
            //the factorial of 0 and 1 is 1
            return 1;
        }
        else {
            // Recursive case: multiply 'n' by the factorial of 'n-1'
            return n * fctrl(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fctrl(n));
    }
}