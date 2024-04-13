public class task2 {
    private static int sumArray(int[] array, int index){
        if (index == array.length){
            return 0; //if the index reaches the length of the array, return 0
        }
        else {
            return array[index] + sumArray(array, index + 1);
            //return the current array element and recursively call sumArray for the next element
        }
    }
    public static double calculateavrg(int[] array){
        // Call sumArray to get the sum of array elements
        double sum = sumArray(array, 0);
        // Divide the total sum by the number of elements in the array to get the average
        return sum/array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1};
        int n = 4;
        double avrg = calculateavrg(numbers);
        System.out.println(avrg);
    }
}