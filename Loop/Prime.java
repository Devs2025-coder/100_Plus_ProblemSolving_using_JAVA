public class Prime {
    public static void main(String[] args) {
        int number = 53; // Example number to check for primality

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }
}
