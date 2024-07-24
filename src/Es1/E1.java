package Es1;

public class E1 {

    private double height;
    private double base;

    public E1(double h, double b) {
        this.height = h;
        this.base = b;
    }

    //METHODS
    public double getPerimeter() {
        return 2 * (base + height);
    }

    public double getArea() {
        return base * height;
    }
}
