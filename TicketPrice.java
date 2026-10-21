import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Are you a student? (Yes/No): "); 
        String isStudent = scanner.next();
        if ((age < 0 || age > 120) || !(isStudent.equalsIgnoreCase("yes") || isStudent.equalsIgnoreCase("no"))) {
            System.out.println("Invalid");
        } else if (age < 12 || age >= 60 ) {
            System.out.println("RM8");
        } else if (isStudent.equalsIgnoreCase("yes")) {
            System.out.println("RM10");
        } else {
            System.out.println("RM15");
        }
         scanner.close();
    }
}











