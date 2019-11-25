package mang.baitap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String Chuoi;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        Chuoi = sc.nextLine();
        System.out.println("Nhap ky tu muon tim : ");
        char kytu = sc.next().charAt(0);
        for (int i = 0; i < Chuoi.length(); i ++){
            if (Chuoi.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + kytu + " trong chuoi " + Chuoi + " la " + count);
    }
}
