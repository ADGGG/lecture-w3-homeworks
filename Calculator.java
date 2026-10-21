import java.util.Scanner;
public class Calculator  {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first value (can be in decimal): ");
        double firstValue =scanner.nextDouble();
        System.out.println("Enter your second value (can be in decimal): ");
        double secondValue =scanner.nextDouble();
        System.out.println("Enter your operator (+, -, *, /): ");
        String operator =scanner.next();
        switch (operator) {
            case "+":
                System.out.println((firstValue + secondValue));
                break;
            case "-":
                System.out.println((firstValue - secondValue));
                break;
            case "*":
                System.out.println((firstValue * secondValue));
                break;
            case "/":
                System.out.println((firstValue / secondValue));
                if (secondValue == 0 ){
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
            
                }
                scanner.close();
                
    }
   
}
