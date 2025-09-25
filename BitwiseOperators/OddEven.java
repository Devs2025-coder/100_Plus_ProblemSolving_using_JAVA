public class OddEven {

    public static void main(String[] args) {
        int number = 6;  // Example number
        if ((number & 1) == 1) { // if the least significant bit is 1, it's odd
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }
}
