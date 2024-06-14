import java.util.Scanner;

public class CheckPrime {
    public boolean  checkPrime(int number) {
        if(number < 2) 
            return false;
        else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0)
                    return false;
            }
            return true;
        }
        
        
    }

    public static void main(String[] args) {
        System.out.print("----------Check Prime----------");

        Scanner scanner = new Scanner(System.in);
        System.err.println("\nEnter number: ");
        int number = scanner.nextInt();

        CheckPrime checkPrime = new CheckPrime();
        if(checkPrime.checkPrime(number))
            System.out.println(number + " is Prime");
        else
            System.err.println(number + " is not Prime");
    }
}