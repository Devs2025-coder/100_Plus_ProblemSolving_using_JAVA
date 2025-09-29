public class ReverseOfADigit {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10; // Append last digit
            number /= 10; // Remove last digit
        }

        System.out.println("Reversed number is: " + reversed);
    }
}
