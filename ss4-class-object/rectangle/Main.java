import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());   
    }
}
