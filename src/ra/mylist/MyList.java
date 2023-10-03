package ra.mylist;

import java.util.Arrays;

public class MyList<E> {
    // so phan tu cua danh sach
    private int size;
    // do dai mac dinh la 10
    private static final int DEFAULT_CAPACITY = 10;

    //
    Object[] elements;

    //constructor khong tham so
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // constructor 1 tham so la capacity
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //  them 1 phan tu E tai vi tri index
    void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else {
            // kiem tra xem danh sach da day chua , neu day roi thi tang size len 1
            if (size == elements.length) {
                // tang kich thuoc mang len
                Object[] newElements = new Object[size + 1];
                for (int i = 0; i < elements.length; i++) {
                    // copy du lieu tu mang cu
                    newElements[i] = elements[i];
                }
                // cap nhap lai elements
                elements = newElements ;
            }
            // them vao vi tri bat ky
            for (int i = elements.length - 1; i >= 0; i--) {
                if (i > index) {
                    // dich chuyen nao lon hon index 1 don vi
                    elements[i] = elements[i - 1];
                }
                if (i == index) {
                    // gia tri can them == index thi gan gia tri bang gia tri truyen vao
                    elements[i] = element;
                }
            }
            size++;
        }
    }

    // xoa theo vi tri index
    void remove(int index) {
        if ( index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index +", Size: " + size) ;
        } else {
            for (int i = 0; i < elements.length -1 ; i++) {
                if (i >= index) {
                    // dich chuyen nao lon hon index 1 don vi
                    elements[i] = elements[i + 1];
                }
            }
            elements[elements.length-1] = null ;
            size-- ;
        }
    }

    // tra ve do dai cua danh sach hien tai
    int size() {
        return size;
    }

    // copy mang hien tai
    Object cloneList() {
        return elements;
    }

    // kiem tra ton tai cua phan tu
    boolean contains(E e) {
        for (Object o : elements) {
            if ( o != null && o.equals(e)) {
                return true ;
            }
        }
        return false;
    }

    // tra ve vi tri cua phan tu E trong danh sach
    int indexOf(E o) {
        for (int i = 0; i < elements.length -1 ; i++) {
            if (elements[i].equals(o)) {
                return i ;
            }
        }
        return -1;
    }

    // them moi --> tra ve bolean
    boolean add(E e) {
        // kiem tra xem danh sach da day chua , neu day roi thi tang size len 1
        if (size == elements.length) {
            // tang kich thuoc mang len
            Object[] newElements = new Object[size + 1];
            for (int i = 0; i < elements.length; i++) {
                // copy du lieu tu mang cu
                newElements[i] = elements[i];
            }
            // cap nhap lai elements
            elements = newElements ;
        }
        // them vao cuoi
        elements[size] = e ;
        size++;
        return true ;
    }

    // thay doi gia tri mac dinh
    void ensureCapacity(int minCapacity) {
        if ( minCapacity > elements.length) {
            // tang kich thuoc mang len
            Object[] newElements = new Object[minCapacity];
            for (int i = 0; i < elements.length; i++) {
                // copy du lieu tu mang cu
                newElements[i] = elements[i];
            }
            // cap nhap lai elements
            elements = newElements ;
        }
    }

    //lay ra phan tu tai vi tri index
    E get(int index) {
        if ( index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index +", Size: " + size) ;
        }
        for (int i = 0; i < elements.length -1 ; i++) {
            if ( i == index) {
                return (E)elements[i];
            }
        }
        return null  ;
    }

    // xoa toan bo phan tu trong danh sach
    void clear() {
        elements= new Object[0];
        size = 0 ;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
