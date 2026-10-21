import java.util.Scanner;
public class NameComparison {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter second name: ");
        String secondName = sc.next();
        if (firstName.equalsIgnoreCase(secondName)){
            System.out.println("Same name.");
        } else if (firstName.compareToIgnoreCase(secondName) < 0){
            System.out.println(firstName + " " + secondName); 
        } else {
            System.out.println(secondName + " " + firstName); 
        }
        sc.close();
    }
} 
