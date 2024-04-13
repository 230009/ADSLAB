public class task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int n = 4;
        System.out.println();
        reverse(array, n -1); // Call the reverse method starting from the last element index
    }
    public static void reverse(int[] array, int index){ //// Recursive method to print the elements of an array in reverse order
        if (index < 0){
            return; //if the index is less than 0, stop the recursion
        }
        System.out.print(array[index] + " "); // Print the current element
        reverse(array, index - 1); // Recursive call to print the next element in reverse order
    }
}