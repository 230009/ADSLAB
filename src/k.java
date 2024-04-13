import java.util.Scanner;

public class k {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the length of array");
        int n = scan.nextInt();
        // Prompt the user to enter the values of the array
        System.out.println("Enter enter the value of your array");
        int [] arr = new int [n];
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt(); // Read each element of the array
        }
        System.out.println("The minimum number is " + minima(arr, n));
    }
    // Recursive method to find the minimum value in an array
    public static int minima(int[] arr, int n){
        if (n == 1)
            return arr[0];
        // compare the last element with the minimum of the rest of the array
        return Math.min(arr[n-1], minima(arr,n-1));


    }

}