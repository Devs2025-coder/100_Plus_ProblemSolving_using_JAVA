import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
       int array[] = new int[5];
       Scanner sc = new Scanner(System.in); 

       for(int i = 0; i < array.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
       }
       sc.close();

       // Calculate sum
       int sum = 0;
         for(int num : array){
                sum += num;
         }

       // Calculate average
       double average = (double) sum / array.length;
       System.out.println("Sum: " + sum);
       System.out.println("Average: " + average);
    }
}
