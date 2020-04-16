package P5_CauTrucDuLieu.BaiTap.MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements=new Object[capacity];
    }

    public int getSize() {
        return this.size;
    }


    public void ensureCapa(int minCapa) {
        int newSize = elements.length + minCapa;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa(1);
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        Object a = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) a;
    }

    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " size: " + size);
        }
        return (E) elements[i];
    }

    public MyList<E> clone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.elements = Arrays.copyOf(elements, size);
        cloneList.size = size;

        return cloneList;

    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapa(1);
        }
        elements[size++] = e;
        return true;
    }


    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

}
