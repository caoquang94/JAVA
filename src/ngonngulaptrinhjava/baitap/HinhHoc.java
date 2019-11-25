package ngonngulaptrinhjava.baitap;

public class HinhHoc {
    public static void main(String[] args) {

        int number = 1;
        while (number <= 5) {
            for (int i = 1; i <= number; i++) {
                System.out.print("*");
            }
            System.out.println();
            number++;



        }
        System.out.println();
        rectangle();
        System.out.println();
        tritangle();
    }

    public static void rectangle() {

        int i = 1;
        while (i <= 5) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");

            }
            System.out.println();
            i++;
        }
    }

    public static void tritangle() {

        int number = 5;
        while (number >= 1){
            for (int i = 1; i  <= number; i++){
                System.out.print("*");
            }
            System.out.println();
            number--;
        }
    }
}