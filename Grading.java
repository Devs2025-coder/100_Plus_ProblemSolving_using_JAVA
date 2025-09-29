import java.util.Scanner;

public class Grading {
    public static char grade(int marks) {
        // Example grading logic
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 30) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int percentage = sc.nextInt();

        char result = grade(percentage);

        System.out.println("Grade is: " + result);

        sc.close(); // ✅ good practice. sc.close must be used  when all operations on scanner are done.
    }
}
