package interfacAbstract.baitap.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[4];
        squares[0] = new Square(3.6);
        squares[1] = new Square();
        squares[2] = new Square(3.5, "indigo", false);
        squares[3] = new Square();
        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square + " " + square.howToColor());
        }
        Square[] squares1 = new Square[2];
        squares1[0] = new Square("red");
        squares1[1] = new Square("blue");
        for(Square square1 : squares1){
            System.out.println(square1.getColor() + " Square " + square1.howToColor());
        }
    }}
