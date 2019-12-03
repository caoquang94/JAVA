package OOP_kethua.baitap;

public class Point {
   private Float x;
   private Float y;
   public static Float[] arr = new Float[2];
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
        Point point = new Point();
        System.out.println("Point : " + point.getXY());
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
    public Float move(Float x, Float y , Float xspeed, Float yspeed){
        return xspeed;
    }
}
