
import java.util.Scanner;

public class GreatestCommonDivisor {
    
    public static void greatestCommonDivisor(int a, int b) {
        while(a != b) {
            if(a > b)
                a = a - b;
            else
                b = b -a;
        }
        System.out.println("Greatest Common Divisor is " + a); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        greatestCommonDivisor(firstNumber, secondNumber);
    }
}
