import java.util.Scanner;
public class Parity {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int value = (a < b ) ? a : b ; 
        String parity = (value % 2 == 0) ? "Even" : "Odd" ;
        System.out.println( (value) + " " + parity);
        sc.close();

    }
}
