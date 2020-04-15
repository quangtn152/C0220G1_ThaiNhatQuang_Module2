package P5_CauTrucDuLieu.ThucHanh.ListCoBan;

import java.lang.reflect.Array;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(0);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(11);
        for (int i = 0; i < 12; i++) {
            System.out.println(listInteger.get(i));
        }
//        System.out.println(Array.getLength(listInteger));
    }
}
