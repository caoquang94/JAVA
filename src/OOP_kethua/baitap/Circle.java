package OOP_kethua.baitap;

public class Circle {
    private  double radius;
    private String color;
    public Circle(double radius){
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius , String indigo, boolean b) {
    }

    public Circle() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public String toString() {
        return  "A Circle "
                + getColor()
                + " with radius="
                + getRadius()
                + ", Area Is :  "
                + getArea()
                +" and " + "Perimeter Is : " + getPerimeter();
    }
}
class test{
    public static void main(String[] args) {

        Circle circle = new Circle(3.5, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5, "black", 3 );
        System.out.println(cylinder);

    }
}