package P5_CauTrucDuLieu.BaiTap.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public int size() {
        return numNodes;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        //khai báo 1 biến temp trỏ đến head
        Node temp = head;
        //sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public Object getFirst() {

        return head.data;
    }

    public Object getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear() {
        Node tempNode = head;
        while (tempNode.next != null) {
            Node next = tempNode.next;
            tempNode.data = null;
            tempNode.next = null;
            tempNode = next;
        }
        tempNode.data = null;
        numNodes = 0;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("index: " + index);
        }
        //Khai báo temp trỏ đến head
        Node temp = head;
        Object data;
        //Nếu index=0 thì trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;

        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }

    public boolean removeObj(E element) {
        //Remove đối tượng nếu  element head
        if (head.data.equals(element)) {
            remove(0);
        } else {
            //Khai báo 1 note temp trỏ đến head
            Node temp = head;
            while (temp.next != null) {
                //Nếu như tồn tại phần tử có data bằng data truyền vào thì node đó sẽ bị remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiểm tra LinkedList có phần tử hay không
        if (numNodes == 0) {
            throw new NullPointerException("This Linkedlist is Null");
        }
        //Khai báo linkedlist trả về
        MyLinkedList<E> returnLinkedlist = new MyLinkedList<>();
        //Khai báo 1 temp trỏ đến head
        Node temp = head;
        //add temp vào danh sách trả về để nó làm head
        returnLinkedlist.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnLinkedlist.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnLinkedlist;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

}
