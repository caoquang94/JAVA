package baitap;

import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght:");
        int numbers = sc.nextInt();

        for (int a = 2; a < numbers; a++) {
            for (int count = 0; count < 20; count++) {
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
                    System.out.println(count + " is a prime");
                else
                    System.out.println(count + " is not a prime");
            }
        }
    }
}

