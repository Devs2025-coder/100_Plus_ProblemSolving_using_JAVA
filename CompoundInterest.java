public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        double rate = 5.0; // Annual interest rate in percentage
        int time = 10; // Time in years

        // Calculate compound interest
        double amount = principal * Math.pow((1 + rate / 100), time);  //Math is a class in java.(Math.pow is a method of Math class)
        double compoundInterest = amount - principal;

        // Display the result
        System.out.printf("The compound interest after %d years is: %.2f%n", time, compoundInterest); //%.2f is used to format the output to 2 decimal places and %d is used to format integer value, %n is used to print a new line.
        
    }
    
}
