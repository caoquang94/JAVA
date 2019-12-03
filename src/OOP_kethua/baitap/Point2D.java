package OOP_kethua.baitap;

import java.util.Arrays;

public class Point2D {

   public Float x;
   public Float y;
   public Float[] arr= new Float[2];
public Point2D(){
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

    public void setArr(Float[] arr) {

    this.arr = arr;
    }

    public Float[] getXY(){
         arr[0]=x;
         arr[1]=y;
         return arr;
    }

    public Point2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.1f,4.3f );
        System.out.println("Point2D" + Arrays.toString(point2D.getXY()));
        Point3D point3D = new Point3D(4.2f, 5.2f, 2.1f );
        System.out.println("Point3D" + Arrays.toString(point3D.getXYZ()));
    }

}
class Point3D extends Point2D{
    Float z;
    Float [] arr = new Float[3];
    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }
    public Point3D(){
    }
    public Point3D(Float x, Float y, Float z){
        super(x, y);
        this.z = z;
    }
    public Float [] getXYZ(){
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        return arr;
    }

}
