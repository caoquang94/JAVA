package OOP_kethua.baitap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shape {

    double size1, size2, size3;
    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public Shape(){
    }
    public Shape(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }


    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        double size1 = sc.nextDouble();
        System.out.println("Enter b : ");
        double size2 = sc.nextDouble();
        System.out.println("Enter c : ");
        double size3 = sc.nextDouble();
        System.out.println("Enter color");
        String color = sc.nextLine();

        Tritangle tritangle = new Tritangle(size1, size2, size3, color);
        System.out.println(tritangle.toString());
    }
}

class Tritangle extends Shape{
    String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tritangle(){
    }
    public  Tritangle(double size1, double size2, double size3, String color){
        super(size1, size2, size3);
        this.color = color;
    }
    public double getArea(){
     return (size3/2) * Math.sqrt(size1*size1 + size2*size2);
    }
    public double getPeremiter(){
        return size1 + size2 + size3;
    }
    @Override
    public String toString(){
        return "A Trangtile " + getColor() + " has Area is " + getArea() + " and Peremiter is  " + getPeremiter();
    }
}