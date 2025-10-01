import java.util.Scanner;

public class DeletionOfAnElement {
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("Enter the element to be deleted:");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        sc.close();

        // Check if the element exists in the array
        int index = 0;
        boolean found = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                index = i;
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in the array.");
            return;
        }

        // Shift elements to the left to delete the element
        for(int i = index; i < array.length - 1; i++){
            array[i] = array[i + 1];
        }

        // Create a new array with one less element
        int newArray[] = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);

        // Print the new array
        System.out.println("Array after deletion:");
        for(int num : newArray){
            System.out.print(num + " ");
        }
    }
}
