package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number = scanner.nextDouble();
        System.out.println("Enter another number : ");
        double number1 = scanner.nextDouble();
        E1 rectangle1 = new E1(number, number1);

        System.out.println("Rectangle 1 = h :" + number + "b : " + number1);

        System.out.println("Enter a number : ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter another number : ");
        double number3 = scanner.nextDouble();
        E1 rectangle2 = new E1(number2, number3);

        System.out.println("Rectangle 2 = h :" + number2 + "b : " + number3);


        // PERIMETERS
        double per1 = rectangle1.getPerimeter();
        double per2 = rectangle2.getPerimeter();
        // AREAS
        double area1 = rectangle1.getArea();
        double area2 = rectangle2.getArea();

        System.out.println("This is the PERIMETER of rectangle1: " + per1);
        System.out.println("This is the AREA of rectangle1: " + area1);
        System.out.println("This is the PERIMETER of rectangle2: " + per2);
        System.out.println("This is the AREA of rectangle2: " + area2);
        System.out.println("sum of perimeters: " + per1 + per2);
        System.out.println("sum of areas: " + area1 + area2);
    }
}
