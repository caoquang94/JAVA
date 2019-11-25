package OOP.thuchanh;

import java.util.Scanner;

public  class Retangle {

        double width, height;

        public Retangle() {
        }

        public Retangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getArea(){
            return this.width * this.height;
        }
        public double getPeremier(){
            return  (this.height + this.width) * 2;
        }
        public String display(){
            return "Retangle {" + " width" + width + ", height " + height + "}";
        }
    }
     class Myclass{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a width : ");
            double width = sc.nextDouble();
            System.out.println("Enter a height : ");
            double height = sc.nextDouble();
            Retangle retangle = new Retangle(width, height);

            System.out.println("Your Rectangle \n"+ retangle.display());
            System.out.println("Perimeter of the Rectangle: "+ retangle.getPeremier());
            System.out.println("Area of the Rectangle: "+ retangle.getArea());
        }

    }

