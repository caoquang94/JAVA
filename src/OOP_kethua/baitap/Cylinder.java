package OOP_kethua.baitap;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getPerimeter(double radius) {

        return 2 * getArea() * height;
    }

    @Override
    public String toString() {
        return  "A Cylinder "
                + getColor()
                + " with radius="
                + getRadius()
                +" and " + "Perimeter Is : " + getPerimeter();
    }
    }

