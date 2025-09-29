public class LCM {
    public static void main(String[] args) {
        int num1 = 12; // Example number 1
        int num2 = 18; // Example number 2
        int lcm = 0;

        // Find the LCM
        for (int i = 1; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
