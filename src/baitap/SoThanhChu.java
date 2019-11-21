package baitap;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Number;
        System.out.println("Enter a Number : ");
        int ten = sc.nextInt();
        switch(ten){

            case 1: Number = "One";
            break;
            case 2: Number = "Two";
                break;
            case 3: Number = "Three";
                break;
            case 4: Number = "Four";
                break;
            case 5: Number = "Five";
                break;
            case 6: Number = "Six";
                break;
            case 7: Number = "Seven";
                break;
            case 8: Number = "Eight";
                break;
            case 9: Number = "Nine";
                break;
            case 10: Number = "Ten";
                break;
            default: Number = "";
        }
        if (Number != "")
            System.out.printf("Number %d Is %s" , ten , Number);
            else
            System.out.println("Invilable!");

    }
}
