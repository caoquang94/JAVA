package CTDL;

import java.util.ArrayList;
import java.util.List;

public class b {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(5);

        // Add elements to the list
        list.add("cd");
        list.add("10");
        list.add("as");
        list.add("sad");
        list.add("sda");

        // Index from which you want to remove element
        int index = 2;

        // Initial list
        System.out.println("Initial List: " + list);

        // remove element
        list.remove(index);

        // Final list
        System.out.println("Final List: " + list);
            //String ArrayList
            List<String> List = new ArrayList<String>();
            List.add("AB");
            List.add("CD");
            List.add("EF");
            List.add("GH");
            List.add("AB");
            List.add("YZ");
            System.out.println("ArrayList before remove:");
//            for (String var : List) {
                System.out.println(List);
//            }
            //Removing 1st element
            List.remove(0);
            //Removing 3rd element from the remaining list
            List.remove(2);
            //Removing 4th element from the remaining list
            List.remove(2);
            System.out.println("ArrayList After remove:");
//            for (String var2 : List) {
                System.out.println(List);
//            }
        }
    }

