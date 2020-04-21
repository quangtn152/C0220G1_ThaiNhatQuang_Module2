package P5_CauTrucDuLieu.BaiTap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        System.out.println("AddFirst:");
        ll.addFirst(11);
        ll.addFirst(12);
        ll.printList();
        System.out.println("Removed index:");
        ll.remove(2);
        ll.printList();
        System.out.println("Added:");
        ll.add(1, 6);
        ll.printList();
        System.out.println("AddLast:");
        ll.addLast(13);
        ll.printList();
        System.out.println("Removed object:");
        ll.removeObj(6);
        ll.printList();
        System.out.println("List size:");
        System.out.println(ll.size());
        System.out.println("List Clone:");
        MyLinkedList llClone = ll.clone();
        llClone.printList();
        System.out.println("List contains:");
        System.out.println(ll.contains(13));
        System.out.println(ll.contains(14));
        System.out.println("List indexof 12:");
        System.out.println(ll.indexOf(12));
        System.out.println(("List get: "));
        System.out.println(ll.get(2));
        System.out.println(("List getFirst: "));
        System.out.println(ll.getFirst());
        System.out.println(("List getLast: "));
        System.out.println(ll.getLast());
        System.out.println(("List Clear: "));
        ll.clear();
        ll.printList();
        System.out.println(ll.size());

    }
}
