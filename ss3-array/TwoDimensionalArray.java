
import java.util.Scanner;


public class TwoDimensionalArray {
    public static int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println("Enter a[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static void displayArray(int[][] array) {
        if(array == null)
            System.out.println("NULL");
        else {
            int rows = array.length;
            for(int i = 0; i < rows; i++) {
                int cols = array[i].length;
                System.out.print("\n");
                for(int j = 0; j < cols; j++) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        
    }
    
    public static int findMax(int[][] array) {
        int max = array[0][0];
        int rows = array.length;
        for(int i = 0; i < rows; i++) {
            int cols = array[i].length;
            for(int j = 0; j < cols; j++) {
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        return max;
    }

    public static int findMin(int[][] array) {
        int min = array[0][0];
        int rows = array.length;
        for(int i = 0; i < rows; i++) {
            int cols = array[i].length;
            for(int j = 0; j < cols; j++) {
                if(array[i][j] < min)
                min = array[i][j];
            }
        }
        return min;
    }

    public static void sumOfCol(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter column you want to total: ");
        int col = scanner.nextInt();

        int rows = array.length;
        for(int i = 0; i < rows; i++) {
            int cols = array[i].length;
            if (cols < col) {
                System.out.println("This column is not available.");
            }
            else 
                sum+= array[i][col];
        }
        System.out.println("Total column " + col + ": " + sum);
    }

    public static void sumOfMainDiagonal(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int rows = array.length;
        for(int i = 0; i < rows; i++) {
            int cols = array[i].length;
            if (cols != rows) {
                System.out.println("This is not a square matrix.");
            }
            else 
                for(int j = 0; j < cols; j++) {
                    if(j == i) 
                        sum += array[i][j];
                }
        }
        System.out.println("Total: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("----------TWO DIMENSION ARRAY----------");
        int[][] array = createArray();
        displayArray(array);
        System.out.println("\n----------FIND MAX VALUE TWO DIMENSION ARRAY----------");
        System.out.println("Max: " + findMax(array));

        System.out.println("\n----------FIND MIN VALUE TWO DIMENSION ARRAY----------");
        System.out.println("Min: " + findMin(array));
        
        System.out.println("\n----------TOTAL OF COLUMN IN TWO DIMENSION ARRAY----------");
        sumOfCol(array);

        System.out.println("\n----------TOTAL VALUES ON THE MAIN DIAGONAL----------");
        sumOfMainDiagonal(array);
    }
}
