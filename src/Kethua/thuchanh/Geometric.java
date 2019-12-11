package Kethua.thuchanh;


import java.util.Scanner;

public class Geometric {
        /* các trường dữ liệu */
        private String color = "white";
        private String filled = null;

        /* các khởi tạo tử */
        public Geometric() {
        }

        public Geometric(String color, String filled) {
            this.color = color;
            this.filled = filled;
        }

        /* các thuộc tính */
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getFilled() {
            return filled;
        }

        public void setFilled(String filled) {
            this.filled = filled;
        }

        public String toString() {
            return "created with \"" + color + "\" color and " +
                    (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
        }
}
 class Circle extends Geometric {
    /* mở rộng trường dữ liệu của lớp cha */
     double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
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

    public double getDiameter() {

        return 2 * radius;
    }
    public String getColor(){
        return "black";
    }
    public String printCircle() {

        return "The " + getColor() + " circle is created with the radius is " + radius;
    }
}
class run{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("radius : ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle.printCircle());
    }
}
