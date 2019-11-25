package mang.baitap;

import java.util.Scanner;

public class TongPhanTuTrongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận: ");
        int m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int n = scanner.nextInt();

        int Arr[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                Arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập Cột Muốn Cộng : ");
        int cell = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(cell <= n && cell == j ){
                    sum += Arr[i][cell];
                }
            }
        }
        System.out.println("Tổng các phần tử trong cột " + cell + " là : " + sum);
    }
}
