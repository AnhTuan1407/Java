package quadratic_equation;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void firstDegreeEquation(double a, double b) {
        if(a == 0) {
            if(b == 0)
                System.out.println("The equation has infinitely many solutions!");
            else 
                System.out.println("The equation has no solutions!");
        }else {
            System.out.println("The equation has one root: x = " + (-b/a));
        }
    }

    public void quadraticEquation () {
        if(this.a == 0) {
            firstDegreeEquation(this.b, this.c);
        }else {
            double delta = (this.b*this.b) - 4*this.a*this.c;
            if (delta < 0) {
                System.out.println("The equation has no solution!");
            } else if (delta == 0) {
                System.out.println("The equation has a double solution: x1 = x2 = " + -delta/2*this.a );
            } else {
                System.out.println("The equation has two root: x1 = " + (-this.b - sqrt(delta))/2*this.a  + ", x2 = " + ((-this.b + sqrt(delta))/2*this.a)) ;
            }
        }
    }

    public void display() {
        System.out.println("Quadratic Equation - a: " + this.a + ", b: " + this.b + ", c: " + c);
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = Scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = Scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = Scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        quadraticEquation.display();
        quadraticEquation.quadraticEquation();
    }
}
