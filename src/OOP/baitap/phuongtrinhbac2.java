package OOP.baitap;

import java.util.Scanner;

public class phuongtrinhbac2 {
    private double a;
    private double b;
    private double c;

    public phuongtrinhbac2() {

    }

    public phuongtrinhbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = (this.b * this.b) - (4 * this.a * this.c);
    }
    public double getRoot1(){
        double s = getDiscriminant();
        return ((-this.b + Math.sqrt(s)) / 2 * this.a);
    }
    public double getRoot2(){
        double s = getDiscriminant();
        return ((-this.b - Math.sqrt(s)) / 2 * this.a);
    }
    public double getRoot3(){
        double s = getDiscriminant();
        return -this.b / (2 * this.a);
    }
     public String condition() {
        double s = getDiscriminant();
        double r1 = getRoot1();
        double r2 = getRoot2();
        double r3 = getRoot3();
        if (s > 0) {
            return "phuong trinh co 2 nghiem : " + r1 + " va " + r2;
        }
        else if (s == 0){
            return "phuong trinh co nghiem kep la : " + r3;}
        else {
            return "phuong trinh vo nghiem!";
        }
    }
    }

    class Result{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("nhap a : ");
            double a = sc.nextDouble();
            System.out.print("nhap b : ");
            double b = sc.nextDouble();
            System.out.print("nhap c : ");
            double c = sc.nextDouble();
            phuongtrinhbac2 pt = new phuongtrinhbac2(a, b, c);
            System.out.println(pt.condition());
        }
    }