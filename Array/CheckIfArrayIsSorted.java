public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int array[] = {1, 2, 4, 3, 5, 6, 7};

        if (isSorted(array)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }

    // Function to check if array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Found an inversion
            }
        }
        return true;
    }
}
