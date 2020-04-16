package P5_CauTrucDuLieu.BaiTap.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        System.out.println("MyList:");

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.print(myList.get(i));
        }
        System.out.println("\nAdd: 5 ");
        myList.add(1, 5);
//        System.out.println(myList.getSize());
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.print(myList.get(i));
        }
        System.out.println("\nRemove: 5 ");
        myList.remove(1);
        for (int i = 0; i < myList.getSize(); i++) {
            System.out.print(myList.get(i));
        }
        System.out.println("\nClone: ");
        MyList<Integer> myList2 = myList.clone();
        for (int i = 0; i < myList2.getSize(); i++) {
            System.out.println("mylist2 " + i + " : " + myList2.get(i));
        }
        System.out.println("\nContains: ");
        if (myList.contains(2)) {
            System.out.println("Mylist chua 2");
        } else System.out.println("Mylist chua khong chua 2");

        System.out.println("Vi tri cua 1: " + myList.indexOf(1));

        System.out.println("\nClear:");
        myList.clear();
        System.out.println("size:" + myList.getSize());

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println("mylist " + i + " : " + myList.get(i));
        }
    }
}
