public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // Example number for which we want the multiplication table
        int limit = 10; // Limit up to which we want the multiplication table

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
