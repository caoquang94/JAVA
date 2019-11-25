package mang.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Array1();
        Array2();
        Array3();

            System.out.println(Array3());
        }


    public static int[] Array1() {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a sizeArray 1:");
            size1 = scanner.nextInt();
            if (size1 > 30)
                System.out.println("Size should not exceed 30");
        } while (size1 > 30);

        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter number for Array 2 " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        return array1;
    }
        public static int[] Array2 () {
            int size2;
            int[] array2;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Enter a sizeArray 2:");
                size2 = scanner.nextInt();
                if (size2 > 30)
                    System.out.println("Size should not exceed 30");
            } while (size2 > 30);

            array2 = new int[size2];
            int j = 0;
            while (j < array2.length) {
                System.out.print("Enter number for Array 1 " + (j + 1) + ": ");
                array2[j] = scanner.nextInt();
                j++;

            }
            return array2;
        }

    public static int [] Array3() {
        int[] arr3 = new int[Array1().length + Array2().length];
        for (int a = 0; a < Array1().length; a++) {
            arr3[a] = Array1()[a];
        }
        for (int j = Array1().length; j < Array2().length; j++) {
            arr3[Array1()[j]] = Array2()[j];
        }
                return arr3;
    }
    }
