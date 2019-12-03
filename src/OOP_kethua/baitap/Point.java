package OOP_kethua.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Point {
   public Float x;
   public Float y;
   public  Float[] arr = new Float[2];
    public Point(){
    }
    public Point(Float x, Float y){
    this.x = x;
    this.y = y;
    }

    public Float getX() {

        return x;
    }

    public void setX(Float x) {

        this.x = x;
    }

    public Float getY() {

        return y;
    }

    public void setY(Float y) {

        this.y = y;
    }
    public Float[] getXY(){
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x : ");
        Float x = sc.nextFloat();
        System.out.println("Enter y : ");
        Float y = sc.nextFloat();
        Point point = new Point(x, y);
        System.out.println("Point : " + Arrays.toString(point.getXY()));
        System.out.println("Enter xspeed : ");
        Float xspeed = sc.nextFloat();
        System.out.println("Enter yspeed : ");
        Float yspeed = sc.nextFloat();
        movePoint movepoint = new movePoint(x, y, xspeed,  yspeed);
        System.out.println(" Point : [" + point.getX() + ", " + point.getY() + "], After add " + movepoint.move());
    }
}
class movePoint extends Point{
    Float xspeed;
    Float yspeed;
    public Float[] arr = new Float[2];

    public Float getXspeed() {
        return xspeed;
    }

    public void setXspeed(Float xspeed) {
        this.xspeed = xspeed;
    }

    public Float getYspeed() {
        return yspeed;
    }

    public void setYspeed(Float yspeed) {
        this.yspeed = yspeed;
    }

    public movePoint(){
    }
    public movePoint(Float x, Float y, Float xspeed, Float yspeed){
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public  Float [] getSpeed(){
        arr[0] = xspeed;
        arr[1] = yspeed;
        return arr;
    }
    public String move(){
        x += xspeed;
        y += yspeed;
        return " speed : [" + x+ " ," + y +"]";
    }
}
