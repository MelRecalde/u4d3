package Es1;

public class Main {
    public static void main(String[] args) {

        E1 rectangle1 = new E1();
        rectangle1.height = 3;
        rectangle1.base = 5;
        E1 rectangle2 = new E1();
        rectangle2.height = 10;
        rectangle2.base = 2;

        // PERIMETERS
        int per1 = rectangle1.getPerimeter();
        int per2 = rectangle2.getPerimeter();
        // AREAS
        int area1 = rectangle1.getArea();
        int area2 = rectangle2.getArea();

        System.out.println("This is the PERIMETER of rectangle1: " + rectangle1.getPerimeter());
        System.out.println("This is the AREA of rectangle1: " + rectangle1.getArea());
        System.out.println("This is the PERIMETER of rectangle2: " + rectangle2.getPerimeter());
        System.out.println("This is the AREA of rectangle2: " + rectangle2.getArea());
        System.out.println("sum of perimeters: " + per1 + per2);
        System.out.println("sum of areas: " + area1 + area2);
    }
}
