
import java.util.Scanner;

public class InsertElementIntoArray {
    
    public static int[] insertElement(int[] array) {
        System.out.println("\nEnter element that you want to insert: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter position you want to insert(index): ");
        int index = scanner.nextInt();

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = number;
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 2, 0, 0, 0, 0};
        System.out.println("Array before insert element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int[] newArray = insertElement(array);
        System.out.println("Array after insert element: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
