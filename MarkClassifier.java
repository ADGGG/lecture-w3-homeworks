import java.util.Scanner;
public class MarkClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks:" );
        int mark = scanner.nextInt();
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid");
        } else if (mark >= 80){
            System.out.println("A");
        } else if (mark >= 65 ){
            System.out.println("B");
        } else if (mark >= 50 ){
            System.out.println("C");
        } else if (mark >= 0 ){
            System.out.println("F");
        }
             scanner.close();
    }
}
