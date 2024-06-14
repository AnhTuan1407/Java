import java.util.Scanner;

public class MenuCheckPrime {
    public static boolean  checkPrime(int number) {
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
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n----------Check Prime----------");
            System.out.println("1. Check prime");
            System.out.println("2. Display prime numbers as required ");
            System.out.println("3. Displays prime numbers less than the entered number");
            System.out.println("0. Exit");

            System.out.println("\nEnter your choice: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter number: ");
                    int number = scanner.nextInt();
                    if(checkPrime(number))
                    System.out.println(number + " is Prime");
                    else
                    System.err.println(number + " is not Prime");
                    break;
                }
    
                case 2:{
                    System.out.println("Enter number: ");
                    int number = scanner.nextInt();
                    System.out.println("First "+ number + " prime numbers");
                    int count = 0;
                    int i = 0;
                    while (count < number) {
                        if(checkPrime(i)) {
                            System.out.print(i + " ");
                            count++;
                        }
                        i++;
                        }
                    break;
                }
                    
                case 3:{
                    System.out.println("Enter number: ");
                    int number = scanner.nextInt();
                    System.out.println("The number of prime numbers less than " + number);
                    int i = 0;
                    while (i < number) {
                        if(checkPrime(i)) 
                            System.out.print(i + " ");
                        i++;
                    }
                    break;  
                }
                    
                case 4: {
                    System.exit(0);
                }   
                
                default :
                    System.out.println("No choice!");
            }
        }
    }
}
