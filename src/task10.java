public class task10 {
    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println(gcd(a, b));// Print the greatest common divisor of a and b

    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; //If the second number b is 0, return a, as GCD(a, 0) is a
        } else {
            return gcd(b, a % b); //// Recursive case: Apply the Euclidean algorithm, which states GCD(a, b) = GCD(b, a % b)
        }
    }
}
