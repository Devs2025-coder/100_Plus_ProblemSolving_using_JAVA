/*
       *
     * *
   * * * 
 * * * * 
 */

public class LeftHandPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // print spaces
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print("  "); // two spaces
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

