package CleanCode.thuchanh.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
    int number;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public FizzBuzz(int number) {
        this.number = number;
    }

    public void FizzBuzz() {
    }
public  String fizzbuzz(int number){
    boolean isFizz = number % 3 == 0;
    boolean isBuzz = number % 5 == 0;
    if(isFizz == isBuzz) {
        return "FizzBuzz";
    }
        if (isFizz) {
            return "Fizz";
        }
            if (isBuzz) {
                return "Buzz";
            } else
                return number + "asf";
        }
    }

class FizzBuzzTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        FizzBuzz fb = new FizzBuzz(number);
        System.out.println(number +" " + fb.fizzbuzz(number));
    }
}
