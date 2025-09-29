import java.util.Scanner;

public class LeapYear {
    public static Boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        Boolean result = isLeapYear(year); // directly call static method
        if (result)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");

        sc.close();
    }
}
