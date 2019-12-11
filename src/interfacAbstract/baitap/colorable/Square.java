package interfacAbstract.baitap.colorable;

import interfacAbstract.thuchanh.comparator.Shape;

public class Square extends Shape implements Colorable {
private double side = 1.0;
public Square(){
}
public Square(double side){
this.side = side;
}
public Square(double side, String color, boolean filled){
    super(color, filled);
    this.side = side;
}

    public Square(String color) {
    this.color = color;
    }

    public double getArea(){
return side*side;
}
public double getPerimeter(){
    return (side+side)*2;
}
    @Override
    public String toString() {
        return "A Square with Area is "
                + getArea()
                + " , Perimeter is "
                + getPerimeter()
                + " and " + getColor();
    }
    @Override
    public String howToColor() {
    return "color all four sides";
    }
}
