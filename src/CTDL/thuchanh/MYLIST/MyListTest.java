package CTDL.thuchanh.MYLIST;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(10);
        listInteger.add(22);
        listInteger.add(35);
        listInteger.add(42);
        listInteger.add(51);


        System.out.println("ArrayList before ");
        System.out.println("element 0: "+listInteger.get(0));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 3: "+listInteger.get(3));
        System.out.println("element 4: "+listInteger.get(4));
//        System.out.println(listInteger);
//        listInteger.remove(2);
//        System.out.println(listInteger);
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
