

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("----------Reverse Array----------");
        System.out.println("Enter number of elements in array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int array[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Enter a[" + (i + 1) + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int reverseArr[] = new int[n];
        System.out.println("\n----------Reverse array----------");
        int j = 0;
        for(int i = n - 1; i >= 0; i--) {
            reverseArr[j] = array[i];
            j++;
        }

        System.out.println("Elements in reverse array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(reverseArr[i] + " ");
        }

        System.out.println("\n----------Reverse array (2)----------");
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Elements in reverse array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}