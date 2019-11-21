package baitap;

import java.util.Scanner;

public class TienTe {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD : ");
        USD = sc.nextDouble();
        double Revert = USD * 23000;
        System.out.print("VND Is : " + Revert);
    }
}
