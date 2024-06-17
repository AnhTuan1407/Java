
import java.util.Scanner;

public class FindElementInArray {

    public static int[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter a[" + (i+1) + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void displayArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int findElementInArray(int[] array) {
        System.out.println("\nEnter number which you want to find in array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) 
            return index;
            index++;
        }
        return -1;
    } 

    public static int findMaxElement(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("----------Find element in array----------");

        System.out.println("Create array");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int size = scanner.nextInt();
        
        int[] array = createArray(size);

        System.out.println("Display array");
        displayArray(array);

        System.out.println("Index: " + findElementInArray(array));

        System.out.println("Max element in array: " + findMaxElement(array));
    }
}
