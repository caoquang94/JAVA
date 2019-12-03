package interfacAbstract.baitap.colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3.6);
        squares[1] = new Square();
        squares[2] = new Square(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Square square : squares) {
            System.out.println(square +" " + square.howToColor());
        }


    }
}
