public class MaxAndMin {
    public static void main(String[] args) {
        int array[] = {5, 3, 8, 1, 4};
        
        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];

        // Traverse the array to find max and min
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
