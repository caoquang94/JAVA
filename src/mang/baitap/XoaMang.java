package mang.baitap;

import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {

        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter a Number of Array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int Arr[] = new int[n];

        System.out.println("Let Input to Array : ");
        for (i = 0; i < n; i++) {
            System.out.print("Enter Element " + i + ": ");
            Arr[i] = scanner.nextInt();
        }

        System.out.println("Enter a Number Want to Delete : ");
        int k = scanner.nextInt();

        // xóa phần tử k ra khỏi mảng
        // vòng lặp for sẽ khởi tạo c = i = 0
        // và duyệt i từ 0 đến n
        // nếu phần tử tại vị trí i khác với số nguyên k
        // thì gán phần tử tại i cho phần tử tại k
        // sau đó tăng c lên 1
        for (c = i = 0; i < n; i++) {
            if (Arr[i] != k) {
                Arr[c] = Arr[i];
                c++;

            }
        }

        n = c;  // lúc này số phần tử trong mảng sẽ bằng c

        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Array After Delete " + k + " Is : ");
        for (i = 0; i < n; i++) {
            System.out.print(Arr[i] + "\t");
        }
    }
}