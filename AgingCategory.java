import java.util.Scanner;
public class AgingCategory {
    public static String categorizeAge(int age) {
        if (age < 0) {
            return "Invalid age";
        } else if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        String category = categorizeAge(age);
        System.out.println("Age: " + age + ", Category: " + category);
    }
}
