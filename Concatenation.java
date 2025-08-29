/* Create a program to input name of the person and
respond with ”Welcome NAME to KG Coding” */

import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");
    }
}
