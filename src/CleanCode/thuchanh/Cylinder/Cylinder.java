package CleanCode.thuchanh.Cylinder;

import java.util.Scanner;

public class Cylinder {
    public  int radius;
    public  int height;

    public Cylinder(){}

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume(){
            double baseArea = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI  * radius;
            double volume = perimeter * height + 2 * baseArea;
            return volume;
        }
    }
class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Enter radius : ");
        int height = sc.nextInt();
        System.out.println("Enter height : ");
        Cylinder cylinder = new Cylinder(radius,height);
        System.out.println("Volume is " + cylinder.getVolume());
    }

}
