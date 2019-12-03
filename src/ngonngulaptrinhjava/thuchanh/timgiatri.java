package ngonngulaptrinhjava.thuchanh;

import java.util.Arrays;
import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        String [] member = {"a", "b", "c", "d", "j", "e", "f", "g", "h", "k", "l", "m", "n" };
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(member));
        System.out.println("Enter a member to find : ");
        String a = sc.nextLine();
        boolean isExits = false;
        for(int i = 0; i < member.length; i++){
            if(member[i].equals(a)){
                System.out.println("Position of " + a + " in the list is: " + (i + 1));
                isExits = true;
                break;
            }
            if(isExits = false){
                System.out.println("Not found " + a + "in the list");
            }
        }
    }
}
