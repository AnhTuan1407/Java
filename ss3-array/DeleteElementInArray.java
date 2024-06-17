

import java.util.Scanner;

public class DeleteElementInArray {

    public static  int[] deleteElement(int[] array) {
        System.out.println("\nEnter element that you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) {
                break;
            }
            index++;
        }

        for(int i = index; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }

        array[array.length - 1] = 0;

        return array;
    } 

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("----------Delete element in array----------");
        System.out.println("Array before delete element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int[] newArray = deleteElement(array);
        System.out.println("Array after delete element: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
