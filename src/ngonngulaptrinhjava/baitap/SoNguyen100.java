package ngonngulaptrinhjava.baitap;



import java.util.Scanner;

public class SoNguyen100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int numbers = sc.nextInt();

        for (int a = 2; a < 100; a++) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(a)) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(a + " is a prime");
            else
                System.out.println(a + " is not a prime");
        }
    }
}